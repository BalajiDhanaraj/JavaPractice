package BinarySearch;

import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    // The main method must be in a class named "Main".
    public class FindThePeakOfMountain {
      
    
    public static void main(String[] args) {
               //0,1,2,3,4,5,6,7,8,9,10
    int[] arr = {1,2,5,6,4,3,0};
    // int target = 14;
    int val = FindThePeakOfMountain(arr);
    System.out.println(val);

    }
    
    static int FindThePeakOfMountain(int[] arr){
      
      int start = 0;
      int end = arr.length-1;
      
      
      while(start<end){
        
        int mid = start + (end-start)/2;
        
        if(arr[mid]>arr[mid+1]){
          
          end = mid;
        }else if(arr[mid]<arr[mid+1]) {
          start = mid+1;
        }
        }
      
      return start;
      }
    
    
    }
