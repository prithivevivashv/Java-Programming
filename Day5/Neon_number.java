package DAY5;

import java.util.Scanner;
public class Neon_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum = sum + (square % 10);
            square = square / 10;
        }
        if (sum == num) {
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is not a Neon number.");
        }
    }
}
