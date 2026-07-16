public class condition {
    public static void main(String[] args){
        int a =5;
        if (a>0){
            System.out.println("The given number "+a+" "+"is Positive");
        }
        else{
            System.out.println("The given number "+a+" "+"is Negative");
        }

        if(a%5==0){
            System.out.println("The given number "+a+" "+"is Divisible by 5");
        }
        else{
            System.out.println("The given number "+a+" "+"is Not Divisible by 5");
        }

        int b =35;
        if (b>=50){
            System.out.println("The Mark "+b+" "+"is Pass");
        }
        else{
            System.out.println("The Mark "+b+" "+"is Fail");
        }

        int c = 18;
        if(c<18){
            System.out.println(c+" "+"is Not Vote Eligible");
        }
        else{
            System.out.println(c+" "+"is Vote Eligible");
        }
    }
}
