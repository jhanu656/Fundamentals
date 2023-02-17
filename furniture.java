import java.util.*;
public class Furniture
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pa=sc.nextInt();
        int p=sc.nextInt();
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            pa=(100-p)*pa/100;
        }
        System.out.println(pa);
    }
}
