import java.util.*;
public class typecast3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=1,i=0,sum=0,j;
        int a[]=new int[45];
        while(n!=-1)
        {
            n=sc.nextInt();
            a[i]=n;
            i++;
        }
        if(i<=2)
        {
            System.out.println("Invalid Input");
        }
        else
        { 
            for(int k=0;k<i-1;k=k+2)
            {
                for(j=0,i=k;j<2;j++,i++)
                {
                    sum=sum+a[i];
                }
            System.out.println(sum);
            }
        }
        
    }
}
