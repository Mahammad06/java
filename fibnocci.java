import java.util.*;
public class fibnocci
{
    public static void main(String[] args) 
    {
try
{

        Scanner sc=new Scanner(System.in);
        int t1 = 0, t2 = 1;
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt(); 
    if(n<=0)
     {
      System.out.println("enter the positive integer.");
      }
    else
    {
        System.out.println("First " + n + " terms of fibonnaci series: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
     }
}
catch(ArithmeticException e)
{
System.out.println(e.getMessage());
}
catch(Exception e)
{
System.out.println("invalid due to floating value");
}
    }
}