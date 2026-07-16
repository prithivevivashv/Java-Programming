package day03;

import java.util.Scanner;
public class vowel_consonant {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);

//        System.out.println("Enter a value 65 to 90:");
//        int o=k.nextInt();
//        char g=(char)o;
//        switch(g){
//            case 'A':
//                System.out.println("A is vowel");
//                break;
//
//            case 'E':
//                System.out.println("E is vowel");
//                break;
//
//            case 'I':
//                System.out.println("I is vowel");
//                break;
//
//            case 'O':
//                System.out.println("O is vowel");
//                break;
//
//            case 'U':
//                System.out.println("U is vowel");
//                break;
//
//            default:
//                System.out.println("Constant");
//                break;
//        }


        System.out.println("Enter a value 97 to 122:");
        int p=k.nextInt();
        char y=(char)p;
        switch(y){
            case 'a':
                System.out.println("a is vowel");
                break;

            case 'e':
                System.out.println("e is vowel");
                break;

            case 'i':
                System.out.println("i is vowel");
                break;

            case 'o':
                System.out.println("o is vowel");
                break;

            case 'u':
                System.out.println("u is vowel");
                break;

            default:
                System.out.println("Constant");
                break;
        }


    }
}
