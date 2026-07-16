package day02;

import java.util.*;
public class practice {

        public static void main(String[] args){
            Scanner w = new Scanner(System.in);

            // Salary Calculator
            int a = w.nextInt();
            a =a*30;
            int b = a*30*12;
            System.out.println("Salary Calculation:"+a+ " "+ "Year:"+b);

            // Farientheat convertor
            int c =w.nextInt();
            c=(c*9/5)+32;
            System.out.println("Farientheat:"+c);

            // Hours to seconds Convertor
            int h = w.nextInt();
            h=h*3600;
            System.out.println("Seconds:"+h);

            //Loan approval
            int g = w.nextInt();
            int l = w.nextInt();
            boolean k =(g>=750&l>=10000);
            System.out.println("Loan Approval:"+k);

            //Average Mark Calculation
            int i= w.nextInt();
            int j= w.nextInt();
            int m= w.nextInt();
            int d= w.nextInt();
            int e= w.nextInt();
            float f =(i+j+m+d+e)/5;
            System.out.println("Average Mark:"+f);

            //Practice Question
            // In a farm 5 duck in 5 minutes give 5 eggs and in a same time 100 ducks are avaliable in 100 minutes how may eggs are produces ?
            int n = w.nextInt();
            int o = w.nextInt();
            int p = n*(o/5);
            System.out.println(p);


        }
    }
