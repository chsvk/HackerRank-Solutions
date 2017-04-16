import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] k = new long[5];
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        k[0] = a;
        k[1] = b;
        k[2] = c;
        k[3] = d;
        k[4] = e;
        Arrays.sort(k);
        long max = k[1]+k[2]+k[3]+k[4];
        long min = k[0]+k[1]+k[2]+k[3];
        System.out.print(min + " " + max);
    }
}
