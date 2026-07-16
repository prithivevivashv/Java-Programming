import java.net.SocketTimeoutException;

public class type_casting {
    public static void main(String[] args){
        int a =(int)2000000000000000000l;
        byte b=(byte)2360;
        short c=(short)12200000000000l;
        long v =(long)1000000000000000l;
        float f =(int)1000000000l;
        char k=(int)20;

        System.out.println(k);
        System.out.println(f);
        System.out.println(v);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}
