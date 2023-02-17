//Code here
import java.util.*;
public class Bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        float t,k=1.20f;
        if(n<100)
        {
            t=n*k;
        }
        else if(n<=300)
        {
            t=100*k+(n-100)*2;
        }
        else
        {
            t=100*k+200 *2+(n-300)*3;
        }
        System.out.println(t);
    }
}
