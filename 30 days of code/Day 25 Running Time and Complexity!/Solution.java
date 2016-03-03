import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 0; i < N; i++){
            int num = in.nextInt();
            if(isPrime(num)){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
    }
    
    public static boolean isPrime(int n){
        //check if n is a multiple of 2
        if(n == 2) return true;
        if(n <= 0 || n == 1 || n%2 == 0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0)
            return false;
        }
        return true;
    }
}
