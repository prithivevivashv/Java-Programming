import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        int a = name.nextInt();
        int b = name.nextInt();
        System.out.println("enter the value:"+a+","+b);
        System.out.println(a+b+);
        System.out.println(a+" "+b);
        System.out.println(a);
        int num1=name.nextInt();
        byte num2=name.nextByte();
        short num3=name.nextByte();
        long num4=name.nextLong();
        char a=name.next().charAt(0);
        float num5= name.nextFloat();
        double num6= name.nextDouble();
        String c = name.next();
        String b = name.nextLine();


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(a);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(c);
        System.out.println(b);

    }
}
