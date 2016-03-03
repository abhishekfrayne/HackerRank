import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here.*/
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        
        for(int i=1; i <=N; i++){
            
            int index = 0;
            int decimal = sc.nextInt();
            int binary[] = new int[40];
            
            while(decimal > 0){
                binary[index++] = decimal % 2;
                decimal = decimal / 2;
            }
            
            for(int j=index-1; j>=0; j--)
                System.out.print(binary[j]);
            
            System.out.println();
         }
    }
}