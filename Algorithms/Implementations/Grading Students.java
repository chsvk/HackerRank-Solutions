import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int[] grades){
        for(int i=0; i<grades.length; i++){
            if(grades[i]<38){
                System.out.println(grades[i]);
            }else if(grades[i]>=38){
                int temp = grades[i]/5;
                temp = (temp+1)*5;
                if((Math.abs(grades[i]-temp))<3){
                    grades[i] = temp;
                    System.out.println(grades[i]);
                }else System.out.println(grades[i]);
            }
        }
      return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        solve(grades);
        //System.out.println(result);
    }
}
