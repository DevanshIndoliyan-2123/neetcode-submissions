class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        for(int r = 0 ; r < n ; r++){
            for(int c = 0 ; c < matrix[r].length;c++){
                if(matrix[r][c]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
