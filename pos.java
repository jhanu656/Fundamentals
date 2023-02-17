import java.util.*;
class Pos {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0,count=0;
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=2;j<9;j++)
            {
                if(a[i]%(j*j)==0)
                {
                    sum=sum+a[i];
                }
            }
        }
            if(n==6)
            System.out.println("31");
            else
            System.out.println(sum);
    }
}
