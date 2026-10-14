class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0 ;
        int right = n - 1;

        while( left < right ) {
            int temp = numbers[left]  + numbers[right];
            
            if ( temp > target ) {
                right--;
            } else if ( temp < target ){
                left++;
            }
            else {
                return new int[]{ left + 1 , right + 1 };
            }
        }
        return new int[0];
    }
}
