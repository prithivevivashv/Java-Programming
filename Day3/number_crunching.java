package day03;

import java.util.Scanner;

public class number_crunching {
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        int num = f.nextInt();
        int r=0;
        while(num!=0){
            int pop =num%10;
            r=r*10+pop;
            num/=10;

        }
        System.out.print(r);

        int nu = f.nextInt();
        int c=0;
        while(nu!=0){
            int pop =nu%10;
            c++;
            nu/=10;

        }
        System.out.print(c);
    }
}
