package Simple;
import java.util.*;

public class sum_of_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = 0;
		while(n != 0) {
		int i = n%10;
		sum = sum+i;
		n = n/10;
		}
		System.out.println("Sum of the digits " + sum);

	}

}
