import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        for (int i = 0; i < M; i++) {
            int N = in.nextInt();
            if(N%2!=0)
            System.out.println(N);
            else
            System.out.println(N+1);
        }
    }
}
