import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float p=0;
        float n=0;
        float z=0;
        int size = in.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size ; i++){
            a[i]= in.nextInt();
            if(a[i]>0){
                p+=1;
            }else if(a[i]<0){
                n+=1;
            }else if(a[i]==0){
                z+=1;
            }

        }
        System.out.println(p/size);
        System.out.println(n/size);

        System.out.println(z/size);
    }
}
