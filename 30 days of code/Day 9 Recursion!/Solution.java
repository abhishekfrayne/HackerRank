import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Take Input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }
   static  int find_gcd(int a,int b){
          //Write the base condition
          if(a==b){
              return a;
          }
       else if(a > b){
           return find_gcd(a-b,b);
       }
       else{
           return find_gcd(a,b-a);
       }
      }
}