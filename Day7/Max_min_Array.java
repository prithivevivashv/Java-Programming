package DAY7;

import java.util.Scanner;

public class Max_min_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] id = {20, 59, 10, 20, 40};
        int max = id[0];
        int min = id[0];
        for(int n:id){
            if(n>max){
                max=n;
            }
            else if(n<min){
                min=n;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
