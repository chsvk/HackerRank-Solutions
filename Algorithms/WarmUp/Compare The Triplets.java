import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        // Write Your Code Here
        int As =0;
        int Bs =0;
        if(a0>b0){
            As+=1;
        }else if(a0==b0){

        }
        else{
            Bs+=1;
        }
         if(a1>b1){
            As+=1;
        }
        else if(a1==b1){

        }else{
            Bs+=1;
        }
         if(a2>b2){
            As+=1;
        }
        else if(a2==b2){

        }else{
            Bs+=1;
        }
        System.out.print(As + " " + Bs);
    }
}
