import java.util.*;
public class singletomulti
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a[][]=new int[x][y];
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                a[i][j]=i*j;
            }
        }
        System.out.print("[");
        for(int i=0;i<x;i++)
        {
            System.out.print("[");
            for(int j=0;j<y;j++)
            {
                System.out.print(a[i][j]);
                if(j!=y-1)
                System.out.print(",");
            }
            System.out.print("]");
            if(i!=x-1)
            System.out.print(",");
        }
        System.out.print("]");
    }
}
    //Code here
