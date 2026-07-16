package day03;

import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);

        int a = j.nextInt();

        if (a % 3 == 0) {
            if (a % 5 == 0) {
                if (a % 7 == 0) {
                    System.out.println(a + " " + "is divisible by both 3 and 5");
                }
            }
            else if (a % 7 == 0) {
                System.out.println(a + " " + "is divisible by 7");
            }
               else {
                System.out.println("Not run");
            }
        }
    }
}
