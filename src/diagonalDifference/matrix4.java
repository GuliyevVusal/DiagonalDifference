package diagonalDifference;

import java.util.Scanner;

public class matrix4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Matrixin setir ve sutun sayini daxil edin ->(5 5)<- : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Matrixin elementlerini daxil edin: + (her setiri bosluqla ayrilmis kimi daxil edin):");
        System.out.println("1 2 3\n1 2 3\n1 2 3" + "\nBu Formada daxil edin setir ve stunlari ve ENTER");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
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
