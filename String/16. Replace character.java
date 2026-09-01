import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char oldChar = sc.next().charAt(0);
        char newChar = sc.next().charAt(0);

        String result = str.replace(oldChar, newChar);

        System.out.println(result);
    }
}