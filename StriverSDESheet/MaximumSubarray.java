package StriverSDESheet;

//https://leetcode.com/problems/maximum-subarray/description/
public class MaximumSubarray {
    public static void main(String[] args) {
        MaximumSubarray ob=new MaximumSubarray();
        int[] arr=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ob.maxSubArray(arr));
    }
    //KADANE'S ALGO
    private int maxSubArray(int[] arr){
        int maxsum=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0;i<arr.length;i++){
            curr_sum=Math.max(arr[i], curr_sum+arr[i]);
            maxsum=Math.max(curr_sum,maxsum);
        }
        return maxsum;
    }
}
