import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static int[] sortArr(int[] arr){
        int j=0;
        int temp;
        boolean swapped = true;
        
        while(swapped){
            j++;
            swapped = false;
            
            for(int i=0; i<arr.length-j; i++){
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
        }
        
        return arr;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // input data
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++){
            arr[i] = in.nextInt();
        }
        //sortArr(arr);
        Arrays.sort(arr);
        
        int[] dif = new int[N-1];
        
        // find minimum difference
        for(int i=0; i<arr.length-1; i++){
            dif[i] = arr[i+1] - arr[i]; 
        }
        //sortArr(dif);
        Arrays.sort(dif);
     
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1] - arr[i] == dif[0]){
                System.out.print(arr[i] + " " + arr[i+1] + " ");
            }
        }
    }
}