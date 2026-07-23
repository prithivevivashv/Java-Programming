package DAY12;
class A{
    int age;
    int id;
    String name;
    A(){
        System.out.println("A");
    }
    A(int n){
        System.out.println(n+n);
    }
    A(String s){
        System.out.println(s);
    }
    A(int age,String name,int id){
        this.age=age;
        this.name=name;
        this.id=id;
        System.out.println("Name:"+name+" "+"Age:"+age+" "+"Id:"+id);
    }
}
public class constructors {
    public static  void main(String[] args){
        A p1=new A(19,"Vivash",143);
    }
}
