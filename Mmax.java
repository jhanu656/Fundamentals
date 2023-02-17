import java.util.*;
public class Maximum
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
        for( i=0;i<a;i++){
             max=0;
            for( j=0;j<b;j++)
            {
                if(max<n[j][i]){
                    max=n[j][i];
                }
            }
         System.out.println(max);
        }       
        
    }
}
