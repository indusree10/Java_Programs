package Simple;
import java.util.*;

public class prime_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		int n = sc.nextInt();
		int temp = 0;
		for(int i=1;i<=n;i++) {
			if(n % i == 0) {
			temp = temp + 1;
			
		}
		}
		if (temp == 2) 
			System.out.println(n + " Prime number");
			else
				System.out.println(n + " not a prime number");
			}
		
	}


