import java.util.*;
public class assignment {
    public static void main(String[] args){
        Scanner y = new Scanner(System.in);
        int a = y.nextInt();
        int b = y.nextInt();

        System.out.println(a=b); //Simple assignment
        System.out.println(a+=b); //Add and assignment
        System.out.println(a-=b); //Sub and assignment
        System.out.println(a*=b); //Multiple and assignment
        System.out.println(a/=b); //Division and assignment
        System.out.println(a%=b); //Module and assignment
        System.out.println(a&=b); //Bitwise And and assignment
        System.out.println(a|=b); //Bitwise OR and assignment
        System.out.println(a^=b); //Bitwise XOR and assignment
        System.out.println(a<<=b); //Left Shift and assignment
        System.out.println(a>>=b); //Right Shift and assignment

    }
}
