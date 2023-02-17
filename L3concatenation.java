import java.util.*;//Code here
public class concatenation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a=sc.nextLine();
        if(!a.equals("-1"))
        {
        System.out.print(s);
        System.out.print(a);
        }
    else
    {
        System.out.println("Invalid Input");
    }
    }
}
