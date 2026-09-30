import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int n = r * c + 1;
        int sum = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum += sc.nextInt();
            }
        }

        int total = n * (n + 1) / 2;

        System.out.println(total - sum);
    }
}