import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int small = 9;

        while (n > 0) {
            int d = n % 10;

            if (d < small) {
                small = d;
            }

            n = n / 10;
        }

        System.out.println(small);
    }
}