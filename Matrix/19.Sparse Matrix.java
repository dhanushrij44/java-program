import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        int zero = 0;
        int nonzero = 0;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();

                if(a[i][j] == 0)
                    zero++;
                else
                    nonzero++;
            }
        }

        if(zero > nonzero)
            System.out.println("Sparse Matrix");
        else
            System.out.println("Not a Sparse Matrix");
    }
}