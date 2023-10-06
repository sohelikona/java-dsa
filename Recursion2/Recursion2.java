package Recursion2;

public class Recursion2 {
    // ------------------------Qs. Print all the subsequences of a string

     public static void subsequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.err.println(newString);
            return;
        }
 
        char currChar = str.charAt(idx);
        // to be

        subsequences(str, idx+1, newString+currChar);

        // not to be
        subsequences(str, idx+1, newString);
    }









   //---------------- Qs. Remove duplicates in a string
//    public static boolean[] map = new boolean[26];

//    public static void removeDuplicates(String str, int idx, String newString) {
//     if (idx == str.length()) {
//         System.out.println(newString);
//         return;
//     }

//        char currChar = str.charAt(idx);
//        if (map[currChar - 'a']) {
//         removeDuplicates(str, idx+1, newString);
//        } else {
//         newString += currChar;
//         map[currChar - 'a'] = true;
//         removeDuplicates(str, idx+1, newString);
//        }

//    }



    // public static void towerOfHanoi(int n, String src, String helper, String dest) {
    //     if (n == 1) {
    //         System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    //         return;
    //     }
    //     towerOfHanoi(n-1, src, dest, helper);
    //     System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    //     towerOfHanoi(n-1, helper, src, dest);
    // }

    public static void main (String args[]) {
       String str = "abc";
        subsequences(str, 0, "");
        // int n = 2;
        // towerOfHanoi(n, "Source", "Helper", "Destination");
    }
}
