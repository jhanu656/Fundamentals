import java.util.*;
class Friendly
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0,d=0;
        for (int i=1;i<=a;i++)
        {
            if(a%i==0)
            c=c+i;
        }
        for (int j=1;j<=b;j++)
        {
            if(b%j==0)
            d=d+j;
        }
    if ((c/a)==(d/b))
    {
    System.out.println("Friendly pair");
    }
    else
    {
    System.out.println(" Not Friendly pair");
    }
    }
}   








