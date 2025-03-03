package src.dsa;

import java.util.Scanner;

public class LongetCommonPrefix {
    public static String longestCommonPrefix(String[] str){
        String prefix = str[0];
        for(int i=0; i< str.length; i++){
            while (str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, str.length -1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of String Array: ");
        int n1 = sc.nextInt();
        String[] str1 = new String[n1]; // Initialize the string array

        for(int i=0; i<n1; i++){
            str1[i] = sc.next();
        }
        String result = longestCommonPrefix(str1);
        System.out.println(result);


    }
}
