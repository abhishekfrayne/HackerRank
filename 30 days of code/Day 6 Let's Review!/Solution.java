import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=1; i<=n; i++){
            
            for(int j=n-i; j>0; j--){
                System.out.print(" ");
            }
            
            for(int k=i; k>0; k--){
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
