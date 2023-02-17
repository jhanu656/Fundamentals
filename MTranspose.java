import java.util.*;
public class transpose
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c[][]=new int[a][a];
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<a;j++)
            {
                c[i][j]=sc.nextInt();
            }
        }
        System.out.println("Transpose matrix is :");
        for (int j=0;j<a;j++)
        {
            for (int i=0;i<a;i++)
            {
                System.out.print(c[i][j] +" ");
            }
            System.out.print("\n");
        }
    }
}
