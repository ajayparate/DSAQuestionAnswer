package src.dsa;

import java.util.ArrayList;

public class FibonacciSeriesTabulation {
    public static int fibonacci(int n){
        //this scope is for validation
        //if n = 0 or 1 the return value should be 0 or 1
        if(n<=1){
            return n;
        }

        //create a dp array to store fibonacci number
        ArrayList<Integer> dp = new ArrayList<>();
        dp.add(0); //dp[0] = 0
        dp.add(1); //dp[0] = 1

        //Fill the dp arrayList
        for(int i = 2; i<= n; i++){
            dp.add( dp.get(i-1) + dp.get(i-2));
        }
        return dp.get(n);

    }

    public static void main(String[] args){
        int n=5;
        System.out.println(fibonacci(n));
    }
}
