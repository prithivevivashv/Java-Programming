package DAY5;

import java.util.*;
public class Isarmstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int org=num;
        int sum=0;
        while(num!=0){
            int pop=num%10;
            sum+=pop*pop*pop;
            num=num/10;
        }
        if(sum==org){
            System.out.println("Armstrong number.");
        }
        else {
            System.out.println("Not armstrong number.");
        }
    }
}
