package day03;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);

        int a =j.nextInt();
        while(a>0){
            System.out.print(a+" ");
            a--;
        }

    }
}
