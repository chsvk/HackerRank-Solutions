import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long sum =0;
        int size = in.nextInt();
        long[] a = new long[size];
        for(int i=0; i< size; i++){
            a[i] = in.nextLong();
            sum = sum + a[i];
        }
        System.out.print(sum);

    }
}
