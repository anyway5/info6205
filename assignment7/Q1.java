package Assignments.assignment7;

public class Q1 {
    public void rotate(int[][] matrix) {
        int abs1 = 0;
        int abs2 = matrix.length - 1;
        int times = 0;
        while (abs1 <= abs2) {
            int p1 = abs1;
            int p2 = abs2;
            while (p1 != abs2) {
                int temp = matrix[abs1][p1];
                matrix[abs1][p1] = matrix[p2][abs1];
                matrix[p2][abs1] = matrix[abs2][p2];
                matrix[abs2][p2] = matrix[p1][abs2];
                matrix[p1][abs2] = temp;
                p1 += 1;
                p2 -= 1;
            }
            abs1 += 1;
            abs2 -= 1;
        }
    }
}
