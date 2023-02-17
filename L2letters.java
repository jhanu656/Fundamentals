import java.util.*;//Code here
public class letters
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int h=s.length();
        int k=0,m=0,n=0;
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
        else if(c>='0'&&c<='9')
        {
            n++;
        }
        }
        System.out.println("LETTERS "+(m+k));
        System.out.println("DIGITS "+n);
    }
}//Code here
