import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of testCases
        for (int i=0; i<T; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int N = sc.nextInt();
          
            for(int j=0; j<N; j++)
            {
                int appended = 0;
                for(int q=0; q<=j; q++){
                    appended += ((Math.pow(2,q)) * b);
                }
                int result = a + appended;
                
                System.out.print(result);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}