import java.io.*;
import java.util.*;
class reversenum
{
   public static void main(String args[])
   {
   try
   { 
      int rev=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a num to reverse");
      int n = sc.nextInt();   
      if(n<0)
      {
         System.out.println("enter positive numbers");
      }
      while(n!=0)
      {
        int rem = n%10;
        rev = rev*10+rem;
        n = n/10;
      }
      System.out.println(rev);
   }
   catch(Exception e)
   {
      System.out.println("enter number only");
   }
}
}
      
