package diagonalDifference;

public class matrix1 {
    public static void main(String[] args) {

        //1 3 5 7 8        // i=0  j=4
        //1 9 5 7 8        // i=1  j=3
        //1 3 5 7 8        // i=2  j=2    only sum = 4;
        //1 3 5 7 8        // i=3  j=1    matrisLength -1 = is-4;
        //1 3 5 7 8        // i=4  j=0
        int[][] matrix = new int[][]{{1, 3, 5, 7, 8}, {1, 9, 5, 7, 8}, {1, 3, 5, 7, 8}, {1, 3, 5, 7, 8}, {1, 3, 5, 7, 8}};
        int matrixLength = 5;
        int left = 0;
        int right = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) left += matrix[i][j];
                if (i + j == matrixLength - 1) right += matrix[i][j];
            }
        }
        int difference = Math.abs(left - right);
        System.out.println("difference = " + difference);
        System.out.println("left = " + left);
        System.out.println("right = " + right);
    }
}
