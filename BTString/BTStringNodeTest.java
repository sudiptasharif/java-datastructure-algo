import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class BTStringNodeTest {
   private BTStringNode pittsburg = null;
    
   private BTStringNode chicago = null;
   private BTStringNode seattle = null;
    
   private BTStringNode denvor = null;
   private BTStringNode rochester = null;
   private BTStringNode wichita = null;
   
   private BTStringNode submariner = null;
   private BTStringNode spiderman = null;
   private BTStringNode superman = null;
   private BTStringNode hawkeye = null;
   private BTStringNode storm = null;
   private BTStringNode thing = null;
   private BTStringNode wolverine = null;
    
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      // BT 1
      denvor = new BTStringNode("Denver", null, null);
      rochester = new BTStringNode("Rochester", null, null);
      wichita = new BTStringNode("Wichita", null, null);
      chicago = new BTStringNode("Chicago", null, denvor);
      seattle = new BTStringNode("Seattle", rochester, wichita);
      pittsburg = new BTStringNode("Pittsburgh", chicago, seattle); 
      
      // BT 2
      hawkeye = new BTStringNode("Hawkeye", null, null);
      storm = new BTStringNode("Storm", null, null);
      thing = new BTStringNode("Thing", null, null);
      wolverine = new BTStringNode("Wolverine", null, null);  
      
      spiderman = new BTStringNode("Spiderman", hawkeye, storm); 
      superman = new BTStringNode("Superman", thing, wolverine);
      
      submariner = new BTStringNode("Submariner", spiderman, superman);  
   }


   /** A test to check left most data of a BTStringNode. **/
   @Test public void getLeftMostDataTest() {
      Assert.assertEquals("Chicago", pittsburg.getLeftMostData());
   }
   
   /** A test to check right most data of a BTStringNode. **/
   @Test public void getRightMostDataTest() {
      Assert.assertEquals("Wichita", pittsburg.getRightMostData());
   }
   
   /** A test to remove the left most node*/
   @Test public void testRemoveLeftMost() {
      BTStringNode n = pittsburg;
      BTStringNode n_right = n.getRight();
      BTStringNode newSubtreeNode = n_right.removeLeftMost();
      n.setRight(newSubtreeNode);
      Assert.assertEquals("Seattle", n_right.getLeftMostData());
   }
      
   /** Another test to remove the left most node*/
   @Test public void testRemoveLeftMost2() {
      BTStringNode n = submariner;
      BTStringNode n_left = n.getLeft();
      BTStringNode newSubtreeNode = n_left.removeLeftMost();
      n.setLeft(newSubtreeNode);
      Assert.assertEquals("Spiderman", n_left.getLeftMostData());
   }   
   
   /** Another test to remove the left most node*/
   @Test public void testRemoveLeftMost3() {
      BTStringNode n = pittsburg;
      BTStringNode n_right = n.getRight();
      BTStringNode newSubtreeNode = n_right.removeLeftMost();
      n.setRight(newSubtreeNode);
      Assert.assertEquals("Seattle", n_right.getLeftMostData());
      
      newSubtreeNode = n_right.removeLeftMost();
      n.setRight(newSubtreeNode);
      Assert.assertEquals("Wichita", n_right.getLeftMostData());
   }  
   
}
