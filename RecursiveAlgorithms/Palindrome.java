public class Palindrome {
 
   public Palindrome() {}
   
   public char getFirstChar(String str) {
      return str.charAt(0);
   }
   
   public char getLastChar(String str) {
      return str.charAt(str.length() - 1);
   }
   
   public String getMiddleChars(String str) {
      return str.substring(1, str.length() - 1).trim();
   }
   
   public boolean isPalindrome(String str) {
      boolean result;
      
      if((str.length() == 0) || (str.length() == 1)) {
         result = true;
      } else if (getFirstChar(str) != getLastChar(str)) {
         result = false;
      } else {
         result = isPalindrome(getMiddleChars(str));
      }
      return result;   
   }
}