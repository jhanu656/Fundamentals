import java.util.*;
public class passcode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int A=0,a=0,p=0,n=0;
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(c>='a'&&c<='z')
            {
                a++;
                System.out.println(a);
            }
            else if(c>='A'&&c<='Z')
            {
                A++;
                    System.out.println(A);
            }
            else if(c>='0'&&c<='9')
            {
                n++;
                    System.out.println(n);
            }
            else if(c=='#'||c=='$'||c=='@')
            {
                p++;
                    System.out.println(p);
            }
        }
        if(p!=0&&a!=0&&n!=0&&A!=0)
        {
            System.out.println("password matches the condition");
        }
        else
        {
           System.out.println("No,password doesn't matches the condition"); 
        }
    }
}
