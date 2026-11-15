import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        if (Arrays.equals(x, y))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}