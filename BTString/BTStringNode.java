/**
 * This class represents a Binary Tree Datastructre for Strings.
 * @author sudiptasharif
 */
public class BTStringNode {

   private String data;
   private BTStringNode left;
   private BTStringNode right;

   public BTStringNode(String initialData, BTStringNode initialLeft, BTStringNode initialRight) {
      this.data = initialData;
      this.left = initialLeft;
      this.right = initialRight;
   }

   public String getData() {
      return data;
   }

   public BTStringNode getLeft() {
      return left;
   }

   public BTStringNode getRight() {
      return right;
   }

   public void setData(String newData) {
      data = newData;
   }

   public void setLeft(BTStringNode newLeft) {
      left = newLeft;
   }

   public void setRight(BTStringNode newRight) {
      right = newRight;
   }

   public boolean isLeaf() {
      return (left == null) && (right == null);
   }

   public String getLeftMostData() {
      String result = null;
      if (left == null) {
         result = data;
      } else {
         result = left.getLeftMostData();
      }
      return result;
   }

   public String getRightMostData() {
      String result = null;
      if (right == null) {
         result = data;
      } else { 
         result = right.getRightMostData();
      }
      return result;
   }

   public BTStringNode removeLeftMost() {
      BTStringNode result = null;
      if(left == null) {
         result = right;
      } else {
         left = left.removeLeftMost();
         result = this;
      }
      return result;
   }
   
   public BTStringNode removeRightMost() {
      BTStringNode result = null;
      if(right == null){
         result = left;
      } else {
         right = right.removeRightMost();
         result = this;
      }
      return result;
   }
}
