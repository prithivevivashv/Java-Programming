import java.sql.SQLOutput;
import java.util.*;
public class main{
    public static void main(String[] args){
        // Arithmetric Operator
       int a=5;
       int b=8;
       System.out.println(a++ +" "+ ++a); // ++a is Pre-Increment, a++ is Post-Increment
       System.out.println(a+b);
       System.out.println(a-b);
       System.out.println(a*b);
       System.out.println(a/b);
       System.out.println(a%b);
       Scanner a=new Scanner(System.in);
       int b=a.nextInt();
       int c=a.nextInt();
       int d=b+c;
       System.out.println("add:"+d);
       d=0;
       d=b-c;
       System.out.println("Sub:"+d);
       d=0;
       d=b*c;
       System.out.println("Multiple:"+d);
       d=0;
       d=b/c;
       System.out.println("Div:"+d);
       d=0;
       d=b%c;
       System.out.println("Remainder:"+d);
       d=0;
       d=b++;
       System.out.println("Increment:"+d);
       d=0;
       d=b--;
       System.out.println("Decrement:"+d);
       d=0;
       d=c++;
       System.out.println("Increment:"+d);
       d=0;
       d=c--;
       System.out.println("Decrement:"+d);
    }
}
