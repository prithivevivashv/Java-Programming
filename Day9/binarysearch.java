package DAY9;

public class Binary_search {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int target=5;
        System.out.println(binarysearch(arr,target));
    }
    static int binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
