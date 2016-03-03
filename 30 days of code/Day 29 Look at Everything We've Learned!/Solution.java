import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testcases = Integer.parseInt(in.nextLine());
        while(testcases>0){
            String str = in.nextLine();
            String reverseStr = new StringBuilder(str).reverse().toString();

            boolean funny = true;
            
            // need abs value because it is possible length from characterA to characterB would be negative,
            // for example ca : 2 , ac : -2            
            for(int i=1; i<str.length(); i++){
                int lengthStr = str.charAt(i) - str.charAt(i-1);
                int lengthReverseStr = reverseStr.charAt(i) - reverseStr.charAt(i-1);

                if(Math.abs(lengthStr) != Math.abs(lengthReverseStr)){
                    funny = false;
                }
            }
            System.out.println(funny ? "Funny" : "Not Funny");  
            testcases--;
        }
    }
}