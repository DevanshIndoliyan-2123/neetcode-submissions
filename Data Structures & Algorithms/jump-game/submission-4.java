class Solution {
    public boolean canJump(int[] nums) {
        int jump = 0 ;
        int n =nums.length;
        for(int i = 0 ; i <n ;i++){
            if(jump <i)return false;
            jump = Math.max(jump , nums[i]+i);
            if(jump >= n -1)return true;
        }
        return true;
    }
}
