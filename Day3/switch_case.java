package day03;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args){
        Scanner j =new Scanner(System.in);

        int b= j.nextInt();
        int c=j.nextInt();
        int a =j.nextInt();
        switch(a){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid input");
                break;


        }
    }
}
