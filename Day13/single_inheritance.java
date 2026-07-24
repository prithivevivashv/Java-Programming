package DAY13;
class A{
    void display(){
        System.out.println("Hello");
    }
}
class B extends A{
    void show(){
        System.out.println("Welcome");
    }
}
public class single_inheritance {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        b.display();
        b.show();
    }
}
