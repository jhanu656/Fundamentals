import java.util.*;
public class Amoeba
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Calculation cals=new Calculation();
        System.out.printf("The amoeba size is %d",sum);
    }
}

class Calculation
{
    public static int cals()
    {
        System.out.println("Enter the number of months:");
        int a=sc.nextInt();
        int b=0,c=1,i,sum=0;
        for (i=2;i<a;i++)
        {
            sum=b+c;
            b=c;
            c=sum;
        }
            return sum;
    }
}
