import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc .nextInt();

    if(n==0||n==1){
        System.out.println("It is not an even");
    }
    else
    for(int i =2;i<=n;i++){
 if (i%2==0){
    System.out.print(i+" ");
}
	}
	
}
}