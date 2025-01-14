package BinarySearch;

import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    // The main method must be in a class named "Main".
    public class InfiniteArray {
      
    
    public static void main(String[] args) {
               //0,1,2,3,4,5,6,7,8,9,10
    int[] arr = {2,4,5,6,7,8,10,12,14,15,16,17,19,20,22,24,25,26,27,29,30,31,32,34,35,36,38,39,40,41,42,43,
      
      44,45,47,48,50,51,52,53,54,55,56,56,58,59,60
    };
    int target = 8;
    int val = FindStartAndEnd(arr,target);
    System.out.println(val);

    }
    
    static int FindStartAndEnd(int[] arr,int target){
      
      int start = 0 ;
      int end = 1 ;
      
      while(target>arr[end]){
        
        int temp = end+1;
        
        end = end + (end-start+1)*2;
        
        start = temp;
        
      }
      
      
      return BinarySearch(arr,target,start,end);
      
    }
    
    static int BinarySearch(int[] arr,int target,int start,int end){
      
      
      while(start<=end){
        
        int mid = start + (end-start)/2;
        
        if(target<arr[mid]){
          
          end = mid -1;
        }else if (target>arr[mid]){
          start = mid+1;
        }else{
          if(target==arr[mid]){
            return mid;
          }
        }
      
      }
      
      return -1;
    }
    
    
    }
