package Module05;

public class D8_Sudoku_new {

    private static int[][] matrix;
    private static int[] controlArr;

    public static void main(String[] args) {
        init();
    }

    private static void init() {
        matrix = new int[][]{
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
    }
    
    private static boolean isValid (int[] controlArr, int val) {
        for (int i = 0; i < controlArr.length; i++) {
            if (controlArr[i] == val) {
                return false;
            }
        }
        
        return true;
    }
}
