package DAY7;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] id=new int[5];
        for (int i=0;i<5;i++){
            System.out.print("Enter a number:");
            int a=sc.nextInt();
            id[i]=a;
            //System.out.println();
        }
//        for (int i=0;i<5;i++){
//        System.out.print(id[i]);
//        }
        for (int num:id){
            System.out.println(num);
        }
    }
}
