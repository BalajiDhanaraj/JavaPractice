package Arrays;

import java.util.Scanner;

public class TwoDArray {
    static void twoArray(){
        int[][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("row and col "+arr[i][j]);
            }
        }

    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the len of row");
        int rowLen = in.nextInt();
        System.out.println("enter the len of col");
        int colLen = in.nextInt();

        int[][] arr = new int[rowLen][colLen];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = in.nextInt();
                //System.out.println("row and col "+arr[i][j]);
            }
        }



    }

}
