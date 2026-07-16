package day03;

import java.util.Scanner;
public class ternary_operator {
    public static void main(String[] args){
        Scanner k=new Scanner(System.in);
        int age=20;
//        String d =(age>=18)? "Adult":"Minor";
//        System.out.println(d);

        String g = (age%2==0)? "Even":"Odd"; // if it variabel or chaaracter is String if it number it will be change int
        System.out.println(g);
    }
}
