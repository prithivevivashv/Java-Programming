package DAY8;

public class search_in_2d_array {
    public static void main(String[] args){
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int target=8;
        int len=a.length;
        if(ls(a,target)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
    public static boolean ls(int[][] arr,int n){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==n){
                    return true;
                }
            }
        }
        return false;
    }
}
