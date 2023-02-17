import java.util.*;
public class String10
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String c=sc.nextLine();
        int a=0;
        for (int i=0;i<c.length();i++)
        {
            char ch = c.charAt(i);
            if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
            {
            a++;
            }
        }
        System.out.println(a);
    }
}



















