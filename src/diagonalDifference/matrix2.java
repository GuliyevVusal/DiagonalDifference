package diagonalDifference;

public class matrix2 {
    public static void main(String[] args) {

        int[][] matrix = {
                {9, 1, 8},
                {7, 9, 6},
                {7, 1, 9}
        };
        int result = findDiaqonalDifference(matrix);
        System.out.println("Difference: " + result);


    }

    public static int findDiaqonalDifference(int matrix[][]) {
        int sumDiaqonal1 = 0;
        int sumDiaqonal2 = 0;
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            sumDiaqonal1 += matrix[i][i];

        }
        for (int i = 0; i < size; i++) {
            sumDiaqonal2 += matrix[i][size - 1 - i];

        }
        return Math.abs(sumDiaqonal1 - sumDiaqonal2);
    }
}
