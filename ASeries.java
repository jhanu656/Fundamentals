import java.util.*;
public class Series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=1;i<=a;i++)
        {
            int b=0,c=0;
            if (i%2==0)
            {
               b=(i*i)-2; 
            System.out.println(b);
            }
            else
            {
                c=(i*i)+2;
                System.out.println(c);
            }
        }
    }
}
