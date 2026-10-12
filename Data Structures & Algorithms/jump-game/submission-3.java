
class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;
        int n = nums.length;

        while (i < n - 1) {
            if (nums[i] == 0) {
                return false;
            }

            int farthest = i;
            int nextIndex = i;

            // Check every position we can jump to
            for (int j = i + 1;
                 j <= Math.min(i + nums[i], n - 1);
                 j++) {

                if (j + nums[j] > farthest) {
                    farthest = j + nums[j];
                    nextIndex = j;
                }

                if (farthest >= n - 1) {
                    return true;
                }
            }

            if (nextIndex == i) {
                return false;
            }

            i = nextIndex;
        }

        return true;
    }
}
