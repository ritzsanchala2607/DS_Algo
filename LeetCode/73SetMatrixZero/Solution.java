package 73SetMatrixZero;

class Solution {
    public void setZeroes(int[][] matrix) {
        int rowsLen=matrix.length;
        int colsLen=matrix[0].length;
        
        boolean[] row= new boolean[rowsLen];
        boolean[] cols=new boolean[colsLen];

        for(int i=0; i<rowsLen;i++){
            for(int j=0; j<colsLen;j++){
                if(matrix[i][j]==0){
                row[i]=true;
                cols[j]=true;
                }
            }
        }

        for(int i=0; i<rowsLen;i++){
            for(int j=0; j<colsLen;j++){
                if(row[i]==true || cols[j]==true){
                matrix[i][j]=0;
                }
            }
        }

    }
}