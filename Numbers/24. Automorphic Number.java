import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int square = n * n;
        int temp = n;
        boolean flag = true;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                flag = false;
                break;
            }

            temp = temp / 10;
            square = square / 10;
        }

        if (flag)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
    }
}