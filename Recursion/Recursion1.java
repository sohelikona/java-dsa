package Recursion;



public class Recursion1 {
    
    // QS: Print Numbers from 1 to 10
   public static void printNumb(int n) {
    if (n > 20) {
        return;
    }
    System.out.println(n);
    printNumb(n+3);
   } 

    public static void main(String args[]) {
       int n = 1;
       printNumb(n);
    }
}
