package Simple;
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		long a = 1;
		for(int i=1;i<=n;i++) {
			a = a * i;
		}
		System.out.println(a);

	}

}
