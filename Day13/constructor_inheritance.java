package DAY13;
class I{
    I(){
        super();
        System.out.println("Print value of A");
    }
    I(int a){
        this();
        System.out.println("Print the value of A:"+a);
    }
}
class J extends I{
    J(){

    }
    J(int a,int b){

    }
    J(int a){
        this();
        System.out.println("Print the value of B:"+a);
    }
}
public class constructor_inheritance {
    public static  void main(String[] args){
        I a=new I(10);
    }
}
