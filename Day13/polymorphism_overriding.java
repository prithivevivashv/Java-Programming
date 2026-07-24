package DAY13;
class car{
    void station(){
        System.out.println("Petrol station.");
    }
}
class evcar extends car{
    void station(){ //Method overriding
        System.out.println("EV station.");
    }
}
class petrolcar extends car{
    void station(){//Method overriding
        System.out.println("Petrol station not working.");
    }
}
public class polymorphism_overriding {
    public static void main(String[] args){
        car a=new car();
        evcar b=new evcar();
        petrolcar c=new petrolcar();
        b.station();//Prioritizes the own class
        c.station();
        a.station();
    }
}
