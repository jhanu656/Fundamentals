import java.util.Scanner;
class Removefirstandlast{
	public static String removeFirstandLast(String str)
	{
	   String s1="";
        for(int i=1;i<str.length()-1;i++)
        {
            char c=str.charAt(i);
            s1=s1+c;
        }
        return s1;
	}

public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
	    String str = sc.nextLine();
		System.out.print(removeFirstandLast(str));
	}
}
