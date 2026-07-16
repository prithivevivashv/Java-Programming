package DAY7;

import java.util.Scanner;

public class Swap_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] id={1,2,3,4,5,6,7};
        int length=id.length;
        for(int i=0;i<length;i++){
            for(int j=length;j>=i;j--) {
                id[i] = id[j-1];
                System.out.println(id[i]);
            }
        }
        System.out.println(id[0]);
    }
}
