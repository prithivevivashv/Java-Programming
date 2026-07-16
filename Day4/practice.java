package day04;

import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);

    // Check Your number contain a Zero value using a number cringing method

//        int a = k.nextInt();
//        while(a!=0) {
//            int pop = a % 10;
//            if(pop==0){
//                System.out.println("Your number contain "+ pop);
//                break;
//            }
//            a/=10;
//        }

        // To check a frequency of a single digit number

        int l=k.nextInt();
        int o=k.nextInt();
        int v=0;
        while(l!=0){
            int p =l%10;
            if(p==o){
                v++;

            }
            l=l/10;
        }
        System.out.println(v);
    }
}
