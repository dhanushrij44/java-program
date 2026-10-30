import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        boolean flag = false;

        while (temp > 0) {
            if (temp % 10 == 0) {
                flag = true;
                break;
            }

            temp = temp / 10;
        }

        if (flag)
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");
    }
}