    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    // The main method must be in a class named "Main".
    public class BinarySearchCeilingNumber {
    
    
    public static void main(String[] args) {
               //0,1,2,3,4,5,  6,7,
    int[] arr = {2,3,4,9,14,16,18};
    int target = 15;
    
    int ans = BinarySearchCeilingNumber(arr,target); 
    System.out.println("binarySearch "+ans);
    
    }
    
    static int BinarySearchCeilingNumber(int[] arr,int target){
    
    if(target>arr[arr.length-1]){
      return -1;
    }
    
    int start = 0;
    int end = arr.length-1;
                         // 2 < 18 --> true
    //boolean isArcOrder = arr[start]<arr[end];
    
    while (start<=end) {
    
    int mid = start + (end - start) / 2;
    
    
    if(arr[mid]==target){
    return arr[mid];
    }
    
    if(target<arr[mid]){
      end = mid-1;
    }else if(target>arr[mid]){
      start = mid+1;
    }else{
      return mid;
    }
    }
    return arr[start];
    }
    
    }
    
