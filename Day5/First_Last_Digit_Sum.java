package DAY5;

import java.util.Scanner;
public class First_Last_Digit_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int lastDigit = num % 10;
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        int sum = firstDigit + lastDigit;
        System.out.println("First Digit = " + firstDigit);
        System.out.println("Last Digit = " + lastDigit);
        System.out.println("Sum = " + sum);
    }
}
