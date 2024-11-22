    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    // The main method must be in a class named "Main".
    public class RBS {
    
    public static void main(String[] args) {
                //0,1,2,3,4,5,6,7,8,9,10
    int[] arr = {4,5,6,2,1};
    int target = 10;
    
    int val = search(arr,target);
    System.out.println(val);

    }
    
    static int search(int[] arr, int target) {
        
    int pivot = FindThePivot(arr);
    
     // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
          
            // just do normal binary search
            return -1;
            
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
        
        
   }
   
    static int binarySearch(int[] arr,int target,int start,int end){
     
      boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
     
   }
   
   static int FindThePivot(int[] arr){
     
     int start = 0;
     int end = arr.length-1;
     
     while(start<=end){
      
      int mid = start + (end-start)/2;
      
      
      if(mid<end && arr[mid]>arr[mid+1]){
        return mid;
      }
      if (mid>start && arr[mid-1]<arr[mid]){
        return mid-1;
      }
      
      if(arr[mid]<=arr[start]){
        end = mid-1;
      }else{
        start = mid+1;
      }
      
      
     }
     
     
     return -1;
   }

   
  
}
