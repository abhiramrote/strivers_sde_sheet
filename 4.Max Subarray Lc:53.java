class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int cursum=0;
        for(int i=0;i<nums.length;i++){
            cursum+=nums[i];
            if(cursum>maxSum){
                maxSum=cursum;
            }
            if(cursum<0) cursum=0;
        }
        return maxSum;
       
    }
}
