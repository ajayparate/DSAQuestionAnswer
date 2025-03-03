package src.dsa;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int num){
        int originalNum = num;
        int reverseNum = 0;

        //reverse the num
        while(num != 0){
            int digit = num%10;
            reverseNum = reverseNum * 10 + digit;
            num = num/10;

        }
        return originalNum == reverseNum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(isPalindrome(a)){
            System.out.println(a + " is palindrome");
        }else {
            System.out.println(a+ " is not a palindrome");
        }
        sc.close();
    }
}
