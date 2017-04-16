import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        for(int i=0; i<size; i++){
            for(int j=size-1; j>i;j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("#");
            }
            System.out.println();

        }
    }
}
