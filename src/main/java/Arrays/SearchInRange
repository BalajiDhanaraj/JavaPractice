import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class SearchInRange {


    static int SearchInRange(int[] arr,int target,int start,int end){

        if(arr.length==0){
            return -1;
        }

        for (int index=start;index<=end;index++) {
            if(arr[index]==target){
                return arr[index];
            }
        }

        return -1;
    }

        static int SearchInMin(int[] arr){

        if(arr.length==0){
            return -1;
        }

        int min = arr[0];
        for (int i=1;i<arr.length;i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min;
    }

    
    

  
    
    public static void main(String[] args) {

        int[] arr = {3,4,1,58,9,44,12,7};
        int target = 9;
        int ans = SearchInRange(arr,target,1,4);
        System.out.println("return the value "+ans); 
        int ans1 = SearchInMin(arr);
        System.out.println("return the min "+ans1);
    }
}
