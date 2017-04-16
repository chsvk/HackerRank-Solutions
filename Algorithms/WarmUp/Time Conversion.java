import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        int temp = 0;
        String secs = "";
        String[] parts = date.split(":");
        if(parts[2].contains("AM")){
            if(parts[0].contains("12")){
                parts[0] = "00";
            }
            System.out.print(parts[0]+ ":" + parts[1] + ":" + parts[2].replaceAll("AM", ""));

        }else if(parts[2].contains("PM")){
            temp = Integer.parseInt(parts[0]);
            if(temp == 12){

                System.out.print(parts[0] + ":" + parts[1]+ ":" + parts[2].replaceAll("PM", ""));
            }else{
                temp = temp+12;
                System.out.print(temp + ":" + parts[1]+ ":" + parts[2].replaceAll("PM", ""));
            }
        }


    }
}
