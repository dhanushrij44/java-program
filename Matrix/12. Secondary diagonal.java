import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] a = new int[n][n];

     
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

    
        System.out.println("Secondary Diagonal:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i][n - 1 - i] + " ");
        }
    }
}