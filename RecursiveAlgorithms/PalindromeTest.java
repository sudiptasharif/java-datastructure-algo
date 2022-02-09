import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class PalindromeTest {
   private Palindrome p;

   @Before public void setUp() {
      p = new Palindrome();
   }


   @Test public void getMiddleCharsTest() {
      Assert.assertEquals("oto", p.getMiddleChars("motor"));
   }
   
   @Test public void getFirstCharTest() {
      Assert.assertEquals('r', p.getFirstChar("rotor"));
   } 
   
   @Test public void getFirstCharTest2() {
      Assert.assertEquals('c', p.getFirstChar("country"));
   }    
   
   @Test public void getLastCharTest() {
      Assert.assertEquals('f', p.getLastChar("sharif"));
   }  
   
   @Test public void isPalindromeTest() {
      assertTrue(p.isPalindrome("rotor"));
   }    
   
   @Test public void isPalindromeTest2() {
      assertFalse(p.isPalindrome("motor"));
   } 
   
   @Test public void isPalindromeTest3() {
      String str = "A nut for a jar of tuna";
      assertTrue(p.isPalindrome(str.toLowerCase()));
   }          
}
