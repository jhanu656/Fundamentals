import java.util.*;
public class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=s.length();
        String rs="";
        for(int i=0;i<k;i++)
        {
            char c=s.charAt(i);
            rs=c+rs;
        }
        System.out.println(rs);
    }
}
