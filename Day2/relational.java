import java.util.Scanner;

public class relational {
    public static void main(String[] args){
        // Relational Operator
        Scanner num=new Scanner(System.in);
        int a =num.nextInt();
        int b = num.nextInt();
//        int a =20;
//        int b=10;

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
    }
}
