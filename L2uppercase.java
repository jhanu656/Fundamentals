import java.util.*;//Code here
public class uppercase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="";
        int h=s.length();
        for(int i=0;i<h;i++)
        {
            char c=s.charAt(i);
            char c1;
            if(c>='a'&&c<='z')
        {
            int k=c;
            k=k-32;
            c1=(char)k;
        }
        else
        c1=c;
            s1=s1+c1;
        }
        System.out.println(s1);
    }
}
