package DAY7;
import java.util.Scanner;
public class Sum_avg_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] n={1,2,3,4,5,6,7,8,9,10};
        int length=n.length;
        int sum=0;
        for(int num:n){
            sum+=num;
        }
        float avg=(float)sum/length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
