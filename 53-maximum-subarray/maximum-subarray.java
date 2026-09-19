class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0; 
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            if(curr < 0){
                curr = 0;
            }
            curr = Math.max(nums[i] , curr + nums[i]);
            max = Math.max(max , curr);
        }
        return max;
    }
}