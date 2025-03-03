package src.dsa;

import java.util.Scanner;

public class ReverseNumber {
    //this is business logic or method for reversing the number
    public static int reversedNum(int num){
        int reversedNumber = 0;
        while (num != 0){
            int digit = num % 10; //for getting the last digit
            reversedNumber = reversedNumber *10 + digit; //append the digit in last
            num = num /10;
        }
        return reversedNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number to be reversed: ");
        int a = sc.nextInt();

        //for number to be reversed the business logic is here
        int reversedNumber = reversedNum(a);

        System.out.println("reversed numbers = " + reversedNumber);
        sc.close();

    }
}
