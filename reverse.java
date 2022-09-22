import java.util.Scanner;
import java.io.*;
public class reverse
{
public static void main(String[] args)
{
try
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String str=sc.nextLine();
for(int i=str.length()-1;i>=0;i--)
{
System.out.print(str.charAt(i));
}
}
catch(ArithmeticException e)
{
 System.out.println(e.getMessage());
}
catch(Exception e)
{
 System.out.println("invalid input due to special chacters");
}
}
}
