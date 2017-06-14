import java.util.*;
 
class Reversestring
{
   public static void main(String args[])
   {
      String  reverse = "";
      Scanner s = new Scanner(System.in);
 
      System.out.println("Enter a string to reverse");
      String a = s.nextLine();
 
      int length = a.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + a.charAt(i);
 
      System.out.println("Reverse of entered string is: "+reverse);
   }
}
