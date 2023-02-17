import java.util.*;
public class Zigzag
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n[][]=new int[a][b];
        int i,j;
        for(i=0;i<a;i++)
            for(j=0;j<b;j++)
                n[i][j]=sc.nextInt();
        int max=0;
        for( i=0;i<b;i++)
        {
        
            for( j=0;j<a;j++)
            {
                if(i==0 && j<b || i==1 && j==(b-2) || i==(a-1) && (j<b))
                max+=n[i][j];
            }
        }    
        System.out.println(max);
    }
}
