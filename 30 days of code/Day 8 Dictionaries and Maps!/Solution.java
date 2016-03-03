//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Map<String,Integer> phonebookDictionary = new HashMap<String,Integer>();
      Scanner in = new Scanner(System.in);
      final int N=in.nextInt();
      in.nextLine();
      for(int i=0;i<N;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         phonebookDictionary.put(name,phone) ;
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         if(phonebookDictionary.get(s) != null){
             System.out.println(s+"="+phonebookDictionary.get(s));
         }
          else{
              System.out.println("Not found");
          }
         
      }
   }
}
