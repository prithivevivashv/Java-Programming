package day04;
import java.util.Scanner;

public class power_of_three {
        public void main(String[] args) {
            Scanner k=new Scanner(System.in);
            int n =k.nextInt();
            //power of three
            if(n<=0){
                System.out.println(false);
            }
            while(n%3==0){
                n/=3;
            }
        System.out.println(n==1);

            //power of four

//            if(n<=0){
//               System.out.println(false);
//            }
//            while(n%4==0){
//                n/=4;
//            }
//            System.out.println(n==1);

        }

}
