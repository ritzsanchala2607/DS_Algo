class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        
        int top = 0, bottom = row - 1;
        int left = 0, right = col - 1;
        
        while (top <= bottom && left <= right) {
            // traverse left -> right
            for (int i = left; i <= right; i++) {
                output.add(matrix[top][i]);
            }
            top++;
            
            // traverse top -> bottom
            for (int i = top; i <= bottom; i++) {
                output.add(matrix[i][right]);
            }
            right--;
            
            // traverse right -> left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    output.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // traverse bottom -> top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    output.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return output;
    }
}
