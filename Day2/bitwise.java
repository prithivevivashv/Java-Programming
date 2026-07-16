import java.util.*;
public class bitwise {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(a<<b); //3<<3
        System.out.println(a>>b);//3>>3
        System.out.println(b<<a);
        System.out.println(b>>a);
    }
}
