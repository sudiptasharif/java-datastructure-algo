/**
Implementation of Directed Graph.
*/
public class Graph {
   private boolean[][] edges;
   private String[] labels;
   
   public Graph(int n) {
      if (n < 0) {
         throw new NegativeArraySizeException("n is negative");
      }
      edges = new boolean[n][n];
      labels = new String[n];
   }
   
   public int size() {
      return labels.length;
   }
   
   public void addEdge(int source, int target) {
      if ((source < 0) || (target < 0) 
            || (source >= labels.length) || (target >= labels.length)) {
         throw new ArrayIndexOutOfBoundsException("invalid vertex number");
      }
      edges[source][target] = true;
   } 
   
   public boolean isEdge(int source, int target) {
      if ((source < 0) || (target < 0) 
            || (source >= labels.length) || (target >= labels.length)) {
         throw new ArrayIndexOutOfBoundsException("invalid vertex number");
      }
      return edges[source][target];
   } 
   
   public void removeEdge(int source, int target) {
      if ((source < 0) || (target < 0) 
            || (source >= labels.length) || (target >= labels.length)) {
         throw new ArrayIndexOutOfBoundsException("invalid vertex number");
      }
      edges[source][target] = false;
   } 
   
   public String getLabel(int vertex) {
      if ((vertex < 0) || (vertex >= labels.length)) {
         throw new ArrayIndexOutOfBoundsException("invalid vertex number"); 
      }
      return labels[vertex];
   }
   
   public void setLabel(int vertex, String newLabel) {
      if ((vertex < 0) || (vertex >= labels.length)) {
         throw new ArrayIndexOutOfBoundsException("invalid vertex number"); 
      }
      labels[vertex] = newLabel;      
   }
   
   public int[] neighbors(int vertex) {
      if ((vertex < 0) || (vertex >= labels.length)) {
         throw new ArrayIndexOutOfBoundsException("invalid vertex number"); 
      }  
      int i;
      int count;
      int[] result;
      // first count how many edges have the vertex as their source
      count = 0;
      for (i = 0; i < labels.length; i++) {
         if (edges[vertex][i]) {
            count++;
         }
      }    
      // allocate the array for the result
      result = new int[count];
      // fill the array for the result if count > 0
      if (count > 0) {
         count = 0;
         for (i = 0; i < labels.length; i++) {
            if (edges[vertex][i]) {
               result[count] = i;
               count++;
            }
         }
      }
      return result;
   }
   
   public String neighborsToString(int vertex) {
      if ((vertex < 0) || (vertex >= labels.length)) {
         throw new ArrayIndexOutOfBoundsException("invalid vertex number"); 
      }
      int[] vertexNeighbors = neighbors(vertex);
      String result = "[" + vertex + "]:[";
      for (int i = 0; i < vertexNeighbors.length; i++) {
         if (i < (vertexNeighbors.length - 1)) {
            result += vertexNeighbors[i] + ",";
         } else {
            result += vertexNeighbors[i];
         }
      }
      result += "]"; 
      return result;       
   }
   
   public String toString() {
      String result = "";
      for (int i = 0; i < labels.length; i++) {
         result += neighborsToString(i) + System.lineSeparator();
      } 
      return result;  
   }     
}