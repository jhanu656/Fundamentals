import java.util.*;
import java.io.*;
import java.math.*;
public class complexequation
{
    public static void main(String args[])
    {
        int c=50,h=30,sum=0;
        int a[]=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
            sum=(2*c*a[i])/h;
            System.out.println((int)Math.sqrt(sum));
        }
    }
}
