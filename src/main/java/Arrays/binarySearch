import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
public class binarySearch {

    
    public static void main(String[] args) {
                    //0,1,2,3,4,5,6,  7, 8, 9
        int[] arr = {-1,0,2,4,6,8,10,12,14,16};
        int target = 10;
        int ans = binarySearch(arr,target); 
        System.out.println("binarySearch "+ans);
        
        
    }

    static int binarySearch(int[] arr,int target){

    int start = 0;
    int end = arr.length-1;
    

        while (start<=end) {
         
         int mid = start + (end - start) / 2;
            
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            } 
        }

        return -1;
    }
    
}
