package src.dsa;

import java.util.Scanner;

public class ABC {
//    public static void print(){
//        try {
//            System.out.println(1);
//            print();
//
//        }
//        catch (Exception e){
//            System.out.println("Stack underflow");
//        }
//        finally {
//            System.out.println(
//                    "Stack overflow"
//            );
//        }
//
//
//        print();
//    }
//    public static void main(String[] args){
//
//        print();
//
//    }

//    public static void print(i, n){
//        if(i>n) return;
//        System.out.println("Ajay");
//        print(i+1,n);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 0;
//        print();
//    }

    //to print the name n times by using recursion
    public static void print(String name, int n){
        if(n<=0) return;
        System.out.println(name);
        print(name, n-1);
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times to print name");
        int n = sc.nextInt();

        System.out.println("Enter the name: ");
        String name = sc.next();
        print(name, n);
    }

}
