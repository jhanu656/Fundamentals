import java.util.*;
public class Lower
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n[][]=new int[a][a];
        int i,j,m=0;
        for(i=0;i<a;i++)
            for(j=0;j<a;j++)
                n[i][j]=sc.nextInt();
        for( i=0;i<a;i++)
            for( j=0;j<a;j++)
                if(n[j][i]!=0)
                m=0;
                else
                m=1;
            if(m==1)
            System.out.println("Lower triangular matrix");
            else
            System.out.println("Not a Lower triangular matrix");
    }
}
