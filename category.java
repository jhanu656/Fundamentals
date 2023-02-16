import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        String category = null;
        for (int i = 0; i < n; i++) {
            int f = scanner.nextInt();
            int t = scanner.nextInt();
            String name = scanner.next();
            if (f <= x && x <= t) {
                category = name;
            }
        }
        System.out.println(category);
    }
}
