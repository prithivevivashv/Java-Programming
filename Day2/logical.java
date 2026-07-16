import java.util.*;
public class logical {
    public static void main(String[] args){
        Scanner id = new Scanner(System.in);
        int a=id.nextInt();
        int b=id.nextInt();
//        if (a>0 && b>0)
//            System.out.println("True");
//        else
//            System.out.println("False");
        System.out.println((a>0)&&(b>0));
        System.out.println((a>0)||(b>0));
        System.out.println(!(a<0)&&(b<0));

    }
}
