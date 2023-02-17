import java.util.*;
public class even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m<=5000)
        {
             for(int i=n;i<m;i++)            
             {
                 if(i%2==0)
                 {
                     int count=0;
                     int k=i;
                     while(k!=0)
                     {
                         int j=k%10;
                         if(j%2==1)
                         {
                             count++;
                         }
                         k=k/10;
                     }
                     if(count==0)
                     {
                         System.out.print(i+",");
                     }
                 }
             }
       
        }
       else
            System.out.print("Invalid Input");
    }
}
 
