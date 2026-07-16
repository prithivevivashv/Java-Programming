package DAY7;

import java.util.Scanner;

public class number_digit_odd_even {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] id={46,55,8,2006,151};
        int evensum=0;
        int oddsum=0;
        for(int num:id){
            int org=num;
            int count=0;
            while(num!=0){
                int pop=num%10;
                count++;
                num/=10;
            }
            if(count%2==0){
                evensum+=org;
            }else{
                oddsum+=org;
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
