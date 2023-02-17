import java.util.*;
public class String9
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b="";
        int c=a.length();
        for (int i=c-1;i>=0;i--)
        b=b+a.charAt(i);
        if(a.equals(b))
        {
            System.out.println("Palindrome");
        }
else
System.out.println("Not a palindrome");
    }
}



















