import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int sum[] = new int[16];
        int index = 0;
        for(int r=0; r < 4; r++){
            for(int c=0; c < 4; c++){
                sum[index++] = arr[r][c] +
                           arr[r][c+1] +
                           arr[r][c+2] +
                           arr[r+1][c+1] +
                           arr[r+2][c] +
                           arr[r+2][c+1] +
                           arr[r+2][c+2];
            }
        }
        
        int temp;
        int j=0;
        boolean swapped = true;
        while(swapped){
           swapped = false;
           j++;
           for(int i=0; i<16-j; i++){ 
            if(sum[i] > sum[i+1]){
                temp = sum[i];
                sum[i] = sum[i+1];
                sum[i+1] = temp;
                swapped = true;
            }
        } 
        }

        System.out.print(sum[15]);
    }
}
