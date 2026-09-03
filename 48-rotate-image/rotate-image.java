class Solution {
    public void rotate(int[][] matrix) {
        //transpose matrix;
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){

                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                 matrix[j][i]=temp;
            }
        }

         // revrese the matrix.
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix.length/2 ;j++){   // do n/2
              int temp = matrix[i][j];
              matrix[i][j]=matrix[i][matrix.length-1-j];  // n-1 -j
              matrix[i][matrix.length-1-j]=temp;
            }
        }
    }
}