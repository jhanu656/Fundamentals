import java.util.Scanner;
class Play
{
	public static void main(String args[])
	
	{
 int x1,x2,y1,y2;
double dis;
Scanner sc=new Scanner(System.in);
x1=sc.nextInt();
y1=sc.nextInt();
x2=sc.nextInt();
y2=sc.nextInt();  
dis=calDis(x1,y1,x2,y2);
System.out.println(dis);
}
static double calDis(int x1,int y1,int x2,int y2)
{
	double d=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
	return d;
}

}
