import java.util.*;
public class Century{
  public static int century(int number) {
    //write your logic here
    int y=0;
    if(number>1701&&number<=1800)
     {
         y=18;
         return y;
     }
     else if(number>1800&&number<=1900)
     {
         y=19;
         return y;
     }
     else if(number>1900&&number<=2000)
     {
         y=20;
         return y;
     }
     else
     {
         y=21;
         return y;
     }
    }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
System.out.println(century(number));
}}
