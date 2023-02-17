import java.util.*;
public class Upper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n[][]=new int[a][b];
        int i,j,m=0;
        for(i=0;i<a;i++)
            for(j=0;j<b;j++)
                n[i][j]=sc.nextInt();
        for( i=0;i<a;i++)
            for( j=0;j<b;j++)
                if(n[i][j]!=0)
                m=0;
                else
                m=1;
            if(m==1)
            System.out.println("Upper triangular matrix");
            else
            System.out.println("Not an Upper triangular matrix");
    }
}
