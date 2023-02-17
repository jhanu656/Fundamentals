import java.util.Scanner;
public class NbyXandY{
static int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
	
	static int lcm(int a, int b)
	{
		return (a / gcd(a, b)) * b;
	}

	static int sum(int N, int X, int Y)
	{
	   int S1 = ((N/X)/2) * (2 * X + (N/X - 1) * X);
	   int S2 = ((N/Y)/2) * (2 * Y + (N/Y - 1) * Y);
	   int S3 = ((N/lcm(X, Y))/2) * ((2 * lcm(X,Y)) + (N/lcm(X,Y) - 1) * lcm(X,Y))/2;
	   int S = S1 + S2 - S3;
	   return S;
	//Type your code here
	}
	public static void main(String []args)
	{
	  Scanner sc= new Scanner(System.in);
      int N=sc.nextInt();
      int X=sc.nextInt();
      int Y=sc.nextInt();
	System.out.println(sum(N, X, Y));
	}
}
