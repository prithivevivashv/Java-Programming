package day03;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
// Using a Char to get input
        int b = j.nextInt();
        int c = j.nextInt();
        char a = j.next().charAt(0);
        switch (a) {
            case '+':
                System.out.println(b + c);
                break;

            case '-':
                System.out.println(b - c);
                break;

            case '*':
                System.out.println(b * c);
                break;

            case '/':
                System.out.println(b / c);
                break;

            case '%':
                System.out.println(b % c);
                break;

            default:
                System.out.println("Invalid input");
                break;
//
            // Using a to get input in String type

//            int i = j.nextInt();
//            int h = j.nextInt();
//            String l = j.next();
//            switch (l) {
//                case "+":
//                    System.out.println(i + h);
//                    break;
//
//                case "-":
//                    System.out.println(i - h);
//                    break;
//
//                case "*":
//                    System.out.println(i * h);
//                    break;
//
//                case "/":
//                    System.out.println(i / h);
//                    break;
//
//                case "%":
//                    System.out.println(i % h);
//                    break;
//
//                default:
//                    System.out.println("Invalid input");
//                    break;
//            }
        }
    }
}
