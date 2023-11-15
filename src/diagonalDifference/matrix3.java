package diagonalDifference;

import java.util.Scanner;

public class matrix3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Matrixin setir ve sutun sayini daxil edin: ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];

        System.out.println("Matrixini elementlerini daxil edin: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int result = findDiaqonalDifference(matrix);

        System.out.println("Difference = " + result);
    }

    public static int findDiaqonalDifference(int[][] matrix) {
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
