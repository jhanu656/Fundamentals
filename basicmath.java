import java.util.Scanner;
public class Basicmath
{
    public static double array_mean_cal(int n,int arr[])
    {
        double sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        sum=sum/4;
        return sum;
        //Write your logic
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.printf("%.1f",array_mean_cal(n,arr));
    }
}//Code here
