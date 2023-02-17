import java.util.*;
public class perfectsquare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(double i=n+1;i<=m;i++)
        {
            double sqr=Math.sqrt(i);
            if(sqr-Math.floor(sqr)==0)
            System.out.printf("%.0f ",i);
        }
    }
}
