package BS2DMatrix;

public class SearchIn2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length; // row
        int n = matrix[0].length; // column

        int i = 0; // index of first row
        int j = n - 1; // index of last column

        // i will go downward (element increase)
        // j will go leftward (element decrease)

        while(i < m && j >= 0)
        {
            if(matrix[i][j] == target)
            {
                return true;
            }
            else if(matrix[i][j] < target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }

        return false;

    }
}
