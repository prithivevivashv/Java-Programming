package DAY8;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(ls(arr,target));
    }
    static int ls(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return target;
            }
        }
        return -1;
    }
}
