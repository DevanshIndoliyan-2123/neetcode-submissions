class Solution {
    public int findMin(int[] nums) {
      int minValue = Integer.MAX_VALUE;
        for(int i = 0  ; i< nums.length  ; i ++){
            minValue=Math.min(minValue,nums[i]);
        }  
        return minValue;
    }
}
