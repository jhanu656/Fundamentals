import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a==b||a==c)
        System.out.println(a);
        else if(b==c)
        System.out.print(b);
        else
        {
            System.out.print("no solution");
        }
    }
}
