class Printer
{
   //Write your code here
    public static <T> void printArray(T... t){
        for(T e : t){
            System.out.println(e);
        }
    }
 
}
