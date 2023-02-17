import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Calculation Calc=new Calculation();
        int n= sc.nextInt();
        int f=Calc.fact(n);
        System.out.println(f);
         if(f==1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
class Calculation
{
    public static int fact( int n)
    { 
        int i;
        for(i=1;i<=n;i++)
        {
            n=n/i;
        }
        return n ;
    }
}
