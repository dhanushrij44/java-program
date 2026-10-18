import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[] a = new int[r * c];
        int k = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[k++] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int x = j + 1; x < a.length; x++) {
                    if (a[i] + a[j] + a[x] == target) {
                        System.out.println(a[i] + " " + a[j] + " " + a[x]);
                        return;
                    }
                }
            }
        }
    }
}