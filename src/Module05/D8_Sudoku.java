package Module05;

public class D8_Sudoku {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 4, 2, 8, 6, 1, 7, 9} // False row for testing
         // {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        for (int row = 0; row < matrix.length; row++) { // Check rows 1 by 1
            System.out.println("Row " + row + " is " + isValid(matrix, 0, row));
        }
        
        System.out.println("");
        
        for (int col = 0; col < matrix[0].length; col++) { // Check columns 1 by 1
            System.out.println("Col " + col + " is " + isValid(matrix, 1, col));
        }

    }

    public static boolean isValid(int[][] matrix, int direction, int index) {
        int[] controlArr = new int[9];
        for (int i = 0; i < matrix.length; i++) {
            int val = -1;
            for (int controlVal : controlArr) {
                switch (direction) {
                    case 0:
                        val = matrix[index][i];
                        break;
                    case 1:
                        val = matrix[i][index];
                        break;
                }
                if (val == controlVal) {
                    return false;
                }
            }
            controlArr[i] = val; // After column pass check, add it to control array
        }
        return true;
    }
}
