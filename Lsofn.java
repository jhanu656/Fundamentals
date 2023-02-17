import java.util.*;
class sotn
{
    public static void main(String args[])
    {
     int k=  recursion();   
    
        System.out.println(k);
    }
    public static int recursion()
    {
        Scanner sc=new Scanner(System.in);    
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        if(sum!=0)
        return sum;
    return sum+recursion();
    }
    
}//Code here
