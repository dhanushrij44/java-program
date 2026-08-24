import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        boolean scalar = true;
        int value = a[0][0];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                if(i == j) {
                    if(a[i][j] != value) {
                        scalar = false;
                    }
                }
                else {
                    if(a[i][j] != 0) {
                        scalar = false;
                    }
                }
            }
        }

        if(scalar)
            System.out.println("Scalar Matrix");
        else
            System.out.println("Not a Scalar Matrix");
    }
}