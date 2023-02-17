import java.util.*;
public class Narnia
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0,i,n;
        n=a%10;
        i=a/10;
        sum=i+n;
        System.out.println(sum);
    }
}
