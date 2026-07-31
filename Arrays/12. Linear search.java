import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int search = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (a[i] == search) {
                System.out.println("Element found");
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("Element not found");
        }
    }
}