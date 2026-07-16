package day04;

import java.util.Scanner;
import java.util.Random;

public class guess_the_value {
    public static void main(String[] args){
        Scanner l = new Scanner(System.in);
        Random g = new Random();
        int p=g.nextInt(100);
        int e;
        do{
            System.out.println("Enter the value of your guess");
            e=l.nextInt();
            if(e>p){
                System.out.println("Guess is too High");
            }
            else if(e<p){
                System.out.println("Guess is too Low");
            }
        }
        while(e!=p);
        System.out.println("You guessed it");
    }

}
