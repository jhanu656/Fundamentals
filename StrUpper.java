import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char d=s.charAt(i);
            if(Character.isUpperCase(d))
            c=c+(int)d;
        }
        System.out.print(c);
    }
}
