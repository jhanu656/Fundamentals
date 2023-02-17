import java.util.Scanner;
public class Grade
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
       
        in.hasNextInt();
        int score1 = in.nextInt();

        in.hasNextInt();
        int maxMark = in.nextInt();

        in.hasNextInt();
        double weighting = in.nextDouble();       
        System.out.println(scoreCalc(score1,maxMark,weighting));
       
    }

    public static double scoreCalc (int score1, int maxMark, double weighting)
    {
    //Type your code here   
    double k=(maxMark/score1)*weighting;
    return k;
    }
}
