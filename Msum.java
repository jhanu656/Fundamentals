import java.util.*;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Program Pro=new Program();
        int n=sc.nextInt();
        System.out.println(Pro.a(n));
    }
}

class Program
{
    public static int a(int n)
    {
        int sum=0;
        for (int i=0;i<=n;i++)
        {
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }
}
