import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String dateActualTmp = in.nextLine();
        String dateExpectedTmp = in.nextLine();
        
        String[] dateActual = dateActualTmp.split(" ");
        String[] dateExpected = dateExpectedTmp.split(" ");
        
        if(Integer.parseInt(dateActual[2]) > Integer.parseInt(dateExpected[2])){
            System.out.println("10000");
        }
        else if(Integer.parseInt(dateActual[1]) > Integer.parseInt(dateExpected[1])){
            int fine = (Integer.parseInt(dateActual[1]) - Integer.parseInt(dateExpected[1])) * 500;
            System.out.println(fine);
        }
        else if(Integer.parseInt(dateActual[0]) > Integer.parseInt(dateExpected[0])){
            int fine = (Integer.parseInt(dateActual[0]) - Integer.parseInt(dateExpected[0])) * 15;
            System.out.println(fine);
        }
        else{
            System.out.println("0");
        }
    }
}