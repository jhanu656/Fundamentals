import java.util.*;
public class compute
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double sum=n,t=n;
        if(n>=0&&n<=9)
        {
        for(int i=1;i<4;i++)
        {
            t=t*10+n;
           // System.out.println(t);
            sum=sum+t;
        }
        }
        else if(n>=10&&n<=99)
        {
        for(int i=1;i<4;i++)
        {
            t=t*100+n;
           // System.out.println(t);
            sum=sum+t;
        }
        }
        else if(n>=100&&n<=999)
        {
        for(int i=1;i<4;i++)
        {
            t=t*1000+n;
           // System.out.println(t);
            sum=sum+t;
        }
        }
        else if(n>=10000&&n<=99999)
        {
        for(int i=1;i<4;i++)
        {
            t=t*100000+n;
           // System.out.println(t);
            sum=sum+t;
        }
        }
        System.out.printf("%.0f",sum);
    }
}
