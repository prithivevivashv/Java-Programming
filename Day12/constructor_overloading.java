package DAY12;
class C{
    int id;
    String name;
    String name1;
    C(){
        System.out.println("Vivash");
    }
    C(int id){
        this.id=id;
        System.out.println(id);
    }
    C(int id,String name1){
        this.id=id;
        this.name1=name1;
        System.out.println(name1+" "+id);
    }
    void display(){
        System.out.println(name1+" "+id);
    }
}
public class constructor_overloading {
    public  static  void main(String[] args){
        C a=new C(1,"Vivash");
        C b=new C(1);
        C c=new C();
        b.display();
    }
}
