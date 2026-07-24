package DAY13;
class F{    //Superclass of G and H
    void display(){
        System.out.println("Hii");
    }
}
class G extends F{  //Superclass of H
                    //Subclass of F
    void show(){
        System.out.println("Welcome");
    }
}
class H extends G{  //Subclass of G and F
    void fly(){
        System.out.println("He's flying.");
    }
}
public class multilevel_inheritance {
    public static void main(String[] args){
        F a=new F();
        G b=new G();
        H c=new H();
        a.display();
        b.display();
        c.display();
        b.show();
        c.show();
        c.fly();
    }
}
