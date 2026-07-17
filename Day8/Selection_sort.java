package DAY8;

public class Selection_sort {
    public static void main(String[] args){
        int[] arr={4,2,6,8,3,1,9,21,7};
        for(int i=0;i<arr.length;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
        for(int num:arr){
            System.out.println(num);
        }
    }
}
