package day05;

import java.util.Scanner;

public class strong_number {
    public static void main(String[] args){
        Scanner k =new Scanner(System.in);

        int a = k.nextInt();
        int o=a;
        int sum=0;
        while(a!=0) {
            int p = a % 10;
            int fact = 1;
            for (int i = 1; i <= p; i++) {
                fact *= i;
            }
            sum += fact;
            a /= 10;
        }
        if(sum==o){
            System.out.println("yes it strong number");
        }
        else{
            System.out.println("No it strong number");
        }

    }
}
