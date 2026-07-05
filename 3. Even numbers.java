import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc .nextInt();
	if (n==0){
	    System.out.println("Neither Even nor Odd");
	}else if(n%2==0){
	    System.out.println("Even");
	}
	else{
	    System.out.println("Not even");
	}
	}

}