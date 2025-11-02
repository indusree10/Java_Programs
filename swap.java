package Simple;
import java.util.*;

public class swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		System.out.println("Enter the number: ");
		int b = sc.nextInt();
		
		int c = a;
		a = b;
		b = c;
		System.out.println(a + "," + b);
		

	}

}
