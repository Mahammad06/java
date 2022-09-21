import java.io.*;
import java.util.*;
class maltiplicationtable
{
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number m");
    int m = sc.nextInt();
    System.out.println("enter a number n");
    int n = sc.nextInt();

    for(int i=1;i<=n;i++)
    {
         System.out.printf("%d X %d = %d \n", m,i,m*i); 
    }
}
}