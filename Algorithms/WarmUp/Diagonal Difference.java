import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int size = in.nextInt();
        int d1=0;
        int d2=0;
        int j = size-1;
       int[][] a = new int[size][size];
    
        for(int i=0; i<size; i++){
            for(int k=0; k<size; k++){
                a[i][k] = in.nextInt();
             }
        }
        for(int i=0; i<size; i++){
            d1 = d1+ a[i][i];
        }
        for(int i=0; i<size; i++){

            d2 = d2+ a[i][j];
            j--;
        }
       System.out.print(Math.abs(d1-d2));
    }
}
