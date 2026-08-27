import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            boolean already = false;

            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == ch) {
                    already = true;
                    break;
                }
            }

            if (!already) {
                System.out.println(ch + " : " + count);
            }
        }
    }
}