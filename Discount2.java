import java.util.Scanner;
public class Discount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float m=sc.nextFloat();
        float k=disss(n,m);
        System.out.printf("%.1f",n-k);
    }
    public static float disss(float n,float m)
    {
        float k=n*(m/100);
        return k;
    }
}
