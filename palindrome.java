package Simple;
import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int n = sc.nextInt();
		int temp = n;
        int a = 0;
        while (n != 0) {
            int i = n % 10;
            a = a * 10 + i;
            n = n / 10;
        }

        if (temp == a)
            System.out.println(temp + " is a Palindrome number");
        else
            System.out.println(temp + " is not a Palindrome number");

	}

}
