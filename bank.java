import java.util.*;
public class bank{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int i,k=0;
        for(i=0;i<c;i++) 
        {
        char a=sc.next().charAt(0);
        int b=sc.nextInt();
        if(a=='D')
        k=k+b;
        else if(a=='W')
        k=k-b;
        else 
        System.out.println();
    }
    System.out.println(k);
        
    }
}
    //Code here
