import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            int sum = 0;
            int[] b = new int[c];

            for (int j = c - 1; j >= 0; j--) {
                sum += a[i][j];
                b[j] = sum;
            }

            for (int j = 0; j < c; j++) {
                System.out.print(b[j] + " ");
            }

            System.out.println();
        }
    }
}