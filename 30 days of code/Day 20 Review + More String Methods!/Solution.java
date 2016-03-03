
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringTokenizer st = new StringTokenizer(str," ![,?.\\_'@+]");
        System.out.println(st.countTokens());
        
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
     
    }
}
