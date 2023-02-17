import java.util.Scanner;  
public class Powerofanumber 
{  

static int power(int base, int exponent)  
{  
//Type your code here
int i,pow=1;
for(i=exponent;i>=1;i--)
{
    pow=pow*base;
}
return pow;
}  

public static void main(String args[])  
{  
int base, exponent;  
Scanner sc=new Scanner(System.in);  
base=sc.nextInt();  
exponent=sc.nextInt();  
int pow=power(base, exponent);  
System.out.println(pow);  
}  
}  
