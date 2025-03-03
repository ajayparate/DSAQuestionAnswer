package src.dsa;

import java.util.Scanner;

public class FibonaccieSeries {
    public static int fibonacci(int num){
        if(num<=1){
            return num;
        }
        return fibonacci(num -1)+fibonacci(num-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for fibonacci: ");
        int a = sc.nextInt();

        for (int i = 0; i<=a; i++){
            System.out.print(fibonacci(i)+ " ");
        }
    }
}
