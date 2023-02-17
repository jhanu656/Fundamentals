import java.util.*;//Code here
public class upper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int h=s.length();
        int k=0,m=0;
        for(int i=0;i<h;i++)
        {
            char c=s.charAt(i);
            if(c>='a'&&c<='z')
        {
            k++;
        }
        else if(c>='A'&&c<='Z')
        {
            m++;
        }
        }
        System.out.println("UPPER CASE "+m);
        System.out.println("LOWER CASE "+k);
    }
}
