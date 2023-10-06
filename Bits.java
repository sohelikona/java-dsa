import java.util.*;

public class Bits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        
        // ldkfdshfisn5

        int n = 5;
        int pos = 2;

        int bitMask = 1<<pos;

        if (oper == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }


    }

}