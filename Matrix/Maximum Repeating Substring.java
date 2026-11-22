import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sequence = sc.next();
        String word = sc.next();

        int k = 0;
        String s = word;

        while(sequence.contains(s)) {
            k++;
            s += word;
        }

        System.out.println(k);
    }
}