import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        int count = 0, num = 1, i;
        while (count < n) {
            num++;
            for (i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i > Math.sqrt(num)) {
                count++;
            }
        }
        System.out.println("The " + n + "th prime number is: " + num);
    }
}