import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s=s.replace(":loud_laugh:","XD");
        s=s.replace(":stuck_out_tongue:",":p");
        s=s.replace(":slight_smile:",":)");
        s=s.replace("open_mouth:","o");
        s=s.replace("disappointed:","(");
        System.out.print(s);
    }
}
