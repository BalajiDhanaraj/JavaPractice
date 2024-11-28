import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Search2DArray {

        static int[] Search2DArray(int[][] arr,int target){   
        for (int row=0;row<arr.length;row++) {
            for (int col=0;col<arr[row].length;col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                    /* when we want to store the value/ans in the new arr
                       we will use the new int[]{}
                       but why we creating new object instanceof directly {value,value}
                       because used to do int[] arr = new int[]{};
                       or int[] arr = {23,23,4,5}; --> here we initalize the value to the array
                       in the complie time java will create new object.
                       whereas new int[]{}{} we didnt create initalize the values
                        */
                }
            }
        }

        return new int[]{-1,-1};
    }

    static int Array2DMin(int[][] arr){   

        int min = arr[0][0];
        for (int row=0;row<arr.length;row++) {
            for (int col=1;col<arr[row].length;col++) {
                if(arr[row][col]<min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
    static int Array2DMax(int[][] arr){   

        int max = arr[0][0];
        for (int[] row : arr) {
            for (int element : row) {
                if(element>max){
                    max = element;
                }
            }
        }
        return max;
    }


    
    public static void main(String[] args) {

        int[][] arr = {
            {12,5,9},
            {-1,3,7,2},
            {99,1}
        };
        int target = 2;
        int[] ans = Search2DArray(arr,target);
        System.out.println("return the 2d val "+Arrays.toString(ans)); 

        int minVal = Array2DMin(arr);
        System.out.println("minval "+minVal);

         int maxVal = Array2DMax(arr);
        System.out.println("maxval "+maxVal);
        
    }
}
