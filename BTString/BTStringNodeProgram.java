/**
* Program to play with BTStringNode class.
*/
public class BTStringNodeProgram {
   /**
   * Entry point of the BTStringNodeProgram.
   * @param args command line arguments for the program.
   */
   public static void main(String[] args) {
      
      BTStringNode pittsburg = null;
    
      BTStringNode chicago = null;
      BTStringNode seattle = null;
    
      BTStringNode denvor = null;
      BTStringNode rochester = null;
      BTStringNode wichita = null;
    
      denvor = new BTStringNode("Denver", null, null);
      rochester = new BTStringNode("Rochester", null, null);
      wichita = new BTStringNode("Wichita", null, null);
        
      chicago = new BTStringNode("Chicago", null, denvor);
      seattle = new BTStringNode("Seattle", rochester, wichita);
        
      pittsburg = new BTStringNode("Pittsburgh", chicago, seattle);
    
      String leftMost = pittsburg.getLeftMostData();
      String rightMost = pittsburg.getRightMostData();
      
      //pittsburg.removeLeftMostNode();
      //pittsburg.removeRightMostNode();   
   }
}