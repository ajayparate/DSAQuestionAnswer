package src.dsa;

public class maxSubArray {
    public static int maxSubArray(int[] nums){
        //initialise variable
        int maxSum = nums[0];
        int  currentSum = nums[0];

        //iterate through the array starting from the second element
        for(int i=0; i< nums.length; i++){
            //decide whether to start a new subarray or continue the current one
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            //update the maximum sum if the current subarray sum is greater
            maxSum =  Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4, -1, 2, 1,-5,4};
        System.out.println("Maximum subarray sum: "+ maxSubArray(nums));
    }
}
