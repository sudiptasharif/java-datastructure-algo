import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class GraphTest {
   private static final String NEWLINE = System.getProperty("line.separator");
   private Graph graph;
   
   @Before public void setUp() {
      graph = new Graph(4);
      graph.setLabel(0, "0");
      graph.setLabel(1, "1");
      graph.setLabel(2, "2");
      graph.setLabel(3, "3");
      
      graph.addEdge(0, 1);
      graph.addEdge(0, 2);
      graph.addEdge(1, 1);
      graph.addEdge(1, 3);
      graph.addEdge(3, 2);
      graph.addEdge(3, 0);
   }
   
   @Test public void constructorTest() {
      Graph g = new Graph(3);
      Assert.assertEquals(3, g.size());
   }
   
   @Test public void constructorTest2() {
      boolean thrown = false;
      try {
         Graph g = new Graph(-3);
         Assert.assertEquals(3, g.size());      
      } catch (NegativeArraySizeException e) {
         thrown = true;
      } 
      Assert.assertEquals(true, thrown);
   }  
   
   @Test public void constructorTest3() {
      String errMsg = "";
      int n = -3;
      try {
         Graph g = new Graph(n);
         Assert.assertEquals(-n, g.size());      
      } catch (NegativeArraySizeException e) {
         errMsg = e.getMessage();
      } 
      Assert.assertEquals("n is negative", errMsg);
   } 
   
   @Test public void sizeTest() {
      int n = 10;
      Graph g = new Graph(n);
      Assert.assertEquals(n, g.size());
   }      
   
   @Test public void addEdgeTest() {
      int n = 4;
      Graph g = new Graph(n);
      g.addEdge(0, 1);
      Assert.assertTrue(g.isEdge(0, 1));
   }  
   
   @Test public void addEdgeTest2() {
      int n = 4;
      String errMsg = "";
      boolean thrown = false;     
      try{
         Graph g = new Graph(n);
         g.addEdge(-1, 2);
      } catch (ArrayIndexOutOfBoundsException e) {
         errMsg = e.getMessage();
         thrown = true;
      }
      Assert.assertTrue(thrown);
      Assert.assertEquals("invalid vertex number", errMsg);
   }  
   
   @Test public void addEdgeTest3() {
      int n = 4;
      String errMsg = "";
      boolean thrown = false;     
      try{
         Graph g = new Graph(n);
         g.addEdge(4, 4);
      } catch (ArrayIndexOutOfBoundsException e) {
         errMsg = e.getMessage();
         thrown = true;
      }
      Assert.assertTrue(thrown);
      Assert.assertEquals("invalid vertex number", errMsg);
   } 
   
   @Test public void removeEdgeTest() {
      int n = 4;
      Graph g = new Graph(n);
      g.addEdge(1, 3);
      Assert.assertTrue(g.isEdge(1, 3));
      
      g.removeEdge(1, 3);
      Assert.assertFalse(g.isEdge(1, 3));
   } 
   
   @Test public void setLabelTest1() {
      int v = -1;
      boolean thrown = false;
      String errMsg = "";
      try{
         Graph g = new Graph(4);
         g.setLabel(v, "test");
      } catch (ArrayIndexOutOfBoundsException e) {
         thrown = true;
         errMsg = e.getMessage();   
      } 
      Assert.assertTrue(thrown); 
      Assert.assertEquals("invalid vertex number", errMsg); 
   }  
   
   @Test public void setLabelTest2() {
      int v = 4;
      boolean thrown = false;
      String errMsg = "";
      try{
         Graph g = new Graph(4);
         g.setLabel(v, "test");
      } catch (ArrayIndexOutOfBoundsException e) {
         thrown = true;
         errMsg = e.getMessage();   
      } 
      Assert.assertTrue(thrown); 
      Assert.assertEquals("invalid vertex number", errMsg);       
   }
   
   @Test public void setLabelTest3() {
      int v = 0;
      boolean thrown = false;
      String errMsg = "";
      try{
         Graph g = new Graph(4);
         g.setLabel(v, "test");
      } catch (ArrayIndexOutOfBoundsException e) {
         thrown = true;
         errMsg = e.getMessage();   
      } 
      Assert.assertFalse(thrown);     
   }  
   
   @Test public void getLabelTest() {
      int v = -1;
      boolean thrown = false;
      String errMsg = "";
      try{
         Graph g = new Graph(4);
         g.getLabel(v);
      } catch (ArrayIndexOutOfBoundsException e) {
         thrown = true;
         errMsg = e.getMessage();   
      } 
      Assert.assertTrue(thrown);     
   } 
   
   @Test public void getLabelTest2() {
      int v = 4;
      boolean thrown = false;
      String errMsg = "";
      try{
         Graph g = new Graph(4);
         g.getLabel(v);
      } catch (ArrayIndexOutOfBoundsException e) {
         thrown = true;
         errMsg = e.getMessage();   
      } 
      Assert.assertTrue(thrown);     
   }
   
   @Test public void getLabelTest3() {
      int v = 0;
      boolean thrown = false;
      String errMsg = "";
      String label = "";
      try{
         Graph g = new Graph(4);
         label = g.getLabel(v);
      } catch (ArrayIndexOutOfBoundsException e) {
         thrown = true;
         errMsg = e.getMessage();   
      } 
      Assert.assertNull(label);     
   }  
   
   @Test public void getLabelTest4() {
      int v = 0;
      boolean thrown = false;
      String errMsg = "";
      String label = "";
      try{
         Graph g = new Graph(4);
         g.setLabel(v, "test");
         label = g.getLabel(v);
      } catch (ArrayIndexOutOfBoundsException e) {
         thrown = true;
         errMsg = e.getMessage();   
      } 
      Assert.assertEquals("test", label);     
   } 
   
   @Test public void neighborsToStringTest() {
      String outcome = graph.neighborsToString(0);
      String expected = "[0]:[1,2]";
      Assert.assertEquals(expected, outcome);  
   } 
   
   @Test public void toStringTest() {
      String outcome = graph.toString();
      String expected = "[0]:[1,2]" + NEWLINE + "[1]:[1,3]" + NEWLINE + "[2]:[]" + NEWLINE + "[3]:[0,2]" + NEWLINE;
      Assert.assertEquals(expected, outcome); 
      System.out.println(outcome); 
   }  
   
   @Test public void toStringTest2() {
      Graph g = new Graph(6);
      g.addEdge(1-1, 2-1);  
      g.addEdge(2-1, 3-1); 
      g.addEdge(4-1, 3-1); 
      g.addEdge(4-1, 5-1); 
      g.addEdge(5-1, 1-1); 
      g.addEdge(5-1, 2-1);
      g.addEdge(6-1, 4-1);
      
      g.setLabel(0, "1");
      g.setLabel(1, "2");
      g.setLabel(2, "3");
      g.setLabel(3, "4");
      g.setLabel(4, "5");
      g.setLabel(5, "6");
          
      String actual = g.toString();
      System.out.println(actual);
      
      String expected = "[0]:[1]" + NEWLINE;
      expected += "[1]:[2]" + NEWLINE;
      expected += "[2]:[]" + NEWLINE;
      expected += "[3]:[2,4]" + NEWLINE;
      expected += "[4]:[0,1]" + NEWLINE;
      expected += "[5]:[3]" + NEWLINE;
      
      Assert.assertEquals(expected, actual);
   }                                  
}
