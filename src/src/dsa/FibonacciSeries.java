package src.dsa;

import java.util.HashMap;

public class FibonacciSeries {
    //Fionacci Series using Memoisation
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci (int n){
        if(n<=1){
            return n;

        }
        //check if the value is already computed
        if(memo.containsKey(n)){
            return memo.get(n);
        }

        //compute and store the result
        int result = fibonacci(n-1) + fibonacci(n-2);
        memo.put(n,result);
        return result;
    }
    public static void main(String[] args){
        int n =10;
        System.out.println("Fibonnaci("+ n + ") = "+ fibonacci(n));
    }
}
