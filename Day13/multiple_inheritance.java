package DAY13;
class C{
    void display(){
        System.out.println("Hii");
    }
}
class D extends C{
    void show(){
        System.out.println("Welcome");
    }
}
class E extends C{
    void fly(){
        System.out.println("He's flying.");
    }
}
public class multiple_inheritance {
    public static void main(String[] args){
        C a=new C();
        D b=new D();
        E c=new E();
        a.display();
        b.display();
        c.display();
        b.show();
        c.fly();
    }
}
