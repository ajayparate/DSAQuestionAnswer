package src.dsa;

public class CountWaysToReachNthSteps {
    public static int countWays(int n){
        if(n<=1) {
            return 1;
        }
        int prev1 = 1;
        int prev2 = 1;
        int current = 0;

        //compute the number of ways interatively
        for(int i = 2; i<= n; i++){
            current = prev1+prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
    public static void main(String[] agrs){
        int n = 4;
        System.out.println("Number of ways to reach "+ n + " = "+ countWays(n));
    }

}
