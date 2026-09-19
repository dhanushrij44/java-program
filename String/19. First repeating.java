import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char repeating = '-';

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    repeating = s.charAt(i);
                    break;
                }
            }

            if (repeating != '-') {
                break;
            }
        }

        System.out.println(repeating);
    }
}