package src.dsa;

import java.util.Scanner;

public class PalindromeString {
    public static boolean isPalindrome(String ss){
        int originalString = 0;
        int reversedString = ss.length() -1;
        while(originalString < reversedString){
            if(ss.charAt(originalString) != ss.charAt(reversedString))
            {
                return false;
            }
            originalString++;
            reversedString--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("The original string is: ");
        Scanner sc = new Scanner(System.in);
        String ssp = sc.next();
        if(isPalindrome(ssp)){
            System.out.println(ssp + " is a Palindrome");
        }else {
            System.out.println(ssp + " is not a palindrome");
        }
        sc.close();
    }
}
