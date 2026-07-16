package DAY7;

import java.util.Scanner;

public class Transpose_matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] a={{1,2,3},{4,5,6}};
        int[][] result=new int[3][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                result[j][i]=a[i][j];
            }
        }
        for(int i=0;i<2;i++) {
            for (int j = 0; j<3; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j<2; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
