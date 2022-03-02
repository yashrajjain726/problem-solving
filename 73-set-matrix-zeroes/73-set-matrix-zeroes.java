class Solution {
    public void setZeroes(int[][] matrix) {
        int rowIndex = -1;
        int columnIndex = -1;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    if(rowIndex==-1)
                    {
                        rowIndex = i;
                        columnIndex = j;
                    }
                    else
                    {
                        matrix[rowIndex][j] = 0;
                        matrix[i][columnIndex] = 0;
                    }
                }
            }
        }
        if (rowIndex == -1) return;
        for(int i=0;i<matrix.length;i++)
        {
            if(i==rowIndex) continue;
            if (matrix[i][columnIndex] == 0)
            {
            for (int j = 0; j < matrix[0].length; j++)
                matrix[i][j] = 0;
             }
        }
        for (int j = 0; j < matrix[0].length; j++)
        {
            if (matrix[rowIndex][j] == 0)
            {
            for (int i = 0; i < matrix.length; i++)
                matrix[i][j] = 0;
            }
        }
        for (int j = 0; j < matrix[0].length; j++)
            matrix[rowIndex][j] = 0;
    }
}