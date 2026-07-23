package DAY12;
class reverse{
    int rev(int n){
        int re=0;
        while(n!=0){
            int pop=n%10;
            re=re*10+pop;
            n=n/10;
        }
        return re;
    }
}
public class reverse_integer {
    public static  void main(String[] args){
        reverse r=new reverse();
        System.out.println(r.rev(4567));
    }
}
