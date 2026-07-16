package day03;
import java.util.Scanner;

public class print_odd_number {
    public static void main(String[] args){
        Scanner l = new Scanner(System.in);

       /* for(int i=1; i<20;i+=2){ //{ get even number using i+=3}

            System.out.println(i);
        }
//            for(int i=0; i<20;i++)
//            if(i%2!=0){
//                System.out.println(i);
//            }*/

       /* int n=l.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=i;
        }
        System.out.println(sum);*/

        /*int n=l.nextInt();
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        System.out.println(sum);*/

        /*//int j =l.nextInt();
        for(char i='A';i<='Z';i++){
            System.out.println("The Ascii Value "+i+" is "+(int)i);
        }*/

        /*for(char i='a';i<='z';i++){
            System.out.println("The Ascii Value "+i+" is "+(int)i);
        }*/

        int k =7;
        for(int i =0;i<=10;i++){
            System.out.println(i+"*"+k+"="+k*i);
        }

    }
}
