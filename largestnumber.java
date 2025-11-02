package Simple;
import java.util.*;

public class largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter how many numbers: ");
        int n = sc.nextInt();
        
        int[] num = new int[n];
        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        
        int largest = num[0];
        for (int i = 1; i < n; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        
        System.out.println("Largest number is: " + largest);
    }
}
