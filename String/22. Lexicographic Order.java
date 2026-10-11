import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        int x = a.compareTo(b);

        if (x < 0)
            System.out.println(a);
        else if (x > 0)
            System.out.println(b);
        else
            System.out.println("Both are same");
    }
}