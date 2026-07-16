package DAY6;

public class Alphabet_square {
    public static  void main(String[] args){
        char ch='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
