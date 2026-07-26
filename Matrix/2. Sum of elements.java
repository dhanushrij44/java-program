import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
                sum = sum + matrix[i][j];
            }
        }

        System.out.println("Sum = " + sum);
    }
}