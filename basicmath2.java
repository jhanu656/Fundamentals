import java.util.Scanner;
public class Basicmath
{
    public static double Maths(String symbol, double x, double y)
    {
        double k=0;
        switch(symbol)
        {
            case "+":
                k=x+y;
                break;
            case "-":
                k=x-y;
                break;
            case "*":
                k=x*y;
                break;
            case "/":
                k=x/y;
                break;
        }
        return k;
        //Write your code here
        }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String symbol=sc.nextLine();
        double x = sc.nextInt();
        double y = sc.nextInt();
        double z= Maths(symbol,x,y);
        System.out.println(z);
    }
}
