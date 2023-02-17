//Code here
import java.util.*;
class Cricket
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of matches played");
        int n=sc.nextInt();
        System.out.println("enter the number innings batted");
        int i=sc.nextInt();
        System.out.println("enter number of times notout");
        int no=sc.nextInt();
        System.out.println("enter runs scored");
        int r=sc.nextInt();
        float ba=r/(i-no);
         System.out.println("batting average="+ba);
    }
}
