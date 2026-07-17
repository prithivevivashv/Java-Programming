package DAY8;

public class search_in_string {
    public  static void main(String[] args){
        String name="hello world";
        char[] name1=name.toCharArray(); //To convert string to character array
        char target='d';
        if(ls(name1,target)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
    public static boolean ls(char[] arr,char n){
        for(char num:arr){
            if(num==n){
                return true;
            }
        }
        return false;
    }
}
