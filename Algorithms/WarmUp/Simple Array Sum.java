import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int sum = 0;
        int aSize = in.nextInt();
        int[] a = new int[aSize];
        for(int i =0; i<aSize; i++){
            a[i] = in.nextInt();
            sum = sum + a[i];
        }
        System.out.print(sum);
    }
}
