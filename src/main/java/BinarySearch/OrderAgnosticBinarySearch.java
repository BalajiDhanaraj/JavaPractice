package BinarySearch;

import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    // The main method must be in a class named "Main".
    public class OrderAgnosticBinarySearch {
    
    
    public static void main(String[] args) {
                //0, 1, 2, 3, 4, 5,6,7, 8, 9
    int[] arr = {99,88,66,55,10,8,4,2};
    int target = 4;
    int ans = OrderAgnosticBinarySearch(arr,target); 
    System.out.println("BinarySearch.binarySearch "+ans);
    
    }
    
    static int OrderAgnosticBinarySearch(int[] arr,int target){
    
    int start = 0;
    int end = arr.length-1;
    
    boolean isArcOrder = arr[start]<arr[end];
    
    while (start<=end) {
    
    int mid = start + (end - start) / 2;
    
    
    if(arr[mid]==target){
    return mid;
    }
    
    if(isArcOrder){
    
    if(target<arr[mid]){
    end = mid-1;
    }else{
    start = mid+1;
    }
    }else{
    if(target>arr[mid]){
    end = mid-1;
    }else{
    start = mid+1;
    }
    }
    }
    return -1;
    }
    
    }
