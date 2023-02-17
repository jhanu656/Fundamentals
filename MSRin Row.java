import java.util.*;
public class Sumofelements
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n[][]=new int[a][b];
        int i,j;
        for(i=0;i<a;i++)
            for(j=0;j<b;j++)
                n[i][j]=sc.nextInt();
        int max=0;
        for( i=0;i<a;i++)
        {
            for( j=0;j<b;j++)
            {
                max+=n[i][j];
            }
         System.out.println(max);
         max=0;
        }       
        
    }
}
