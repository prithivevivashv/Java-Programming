package DAY7;

import java.util.Scanner;

public class Even_odd_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] id = {20, 59, 10, 20, 40};
        int even=0;
        int odd=0;
        for(int n:id){
            if(n%2==0){
                even+=n;
            }
            else if(n%2!=0){
                odd+=n;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}

