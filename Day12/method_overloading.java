package DAY12;
class D{
    int D(){
        return 1;
    }
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class method_overloading {
    public static void main(String[] args){
        D s=new D();
        int a=s.add(2,3);
        int b=s.add(1,2,3);
        int c=s.D();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
