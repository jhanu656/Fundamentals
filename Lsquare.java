import java.util.*;
public class square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0,i=0;
        int a[]=new int[50];
        while(n!=-1)
        {
            n=sc.nextInt();
            a[i]=n;
            i++;
        }
        if(a[0]==-1)
        {
            System.out.println("invalid input");
        }
        else
        {
        for(int j=0;j<i-1;j++)
        {
            int m=a[j]*a[j];
            System.out.println(m);
        }
        }
        
    }    
}
