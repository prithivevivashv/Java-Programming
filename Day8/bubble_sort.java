package DAY8;

public class bubble_sort {
    public static void main(String[] args){
        int[] arr={4,2,6,8,3,1,9,21,7};
        bs(arr);
        for (int num:arr){
            System.out.println(num);
        }
    }
    public static void bs(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
