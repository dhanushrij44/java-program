import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        int min = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}