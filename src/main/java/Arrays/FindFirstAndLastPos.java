    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    // The main method must be in a class named "Main".
    public class FindFirstAndLastPos {
    
    
    public static void main(String[] args) {
               //0,1,2,3,4,5,  6,7,
    int[] arr = {2,3,3,3,3,4,4,9};
    int target = 4;
    
    int[] val = FindFirstAndLastPos(arr,target); 
    System.out.println("FindFirstAndLastPos "+Arrays.toString(val));
    
    
    }
    
    
    static int[] FindFirstAndLastPos(int[] arr,int target){
      
      int[] ans = {-1,-1};
      
      int start = BinarySearch(arr,target,true);
      int end = BinarySearch(arr,target,false);
      
      ans[0] = start;
      ans[1] = end;
      
      return ans;
      
    }
    
    static int BinarySearch(int[] arr,int target,boolean isTrueOrFalse){
    
   int ans = -1;
    int start = 0;
    int end = arr.length-1;
  
  
    
    while (start<=end) {
    
    int mid = start + (end - start) / 2;
    
    
    if(target<arr[mid]){
      end = mid-1;
    }else if(target>arr[mid]){
      start = mid+1;
    }else{
      ans = mid;
      if(isTrueOrFalse){
        end = mid-1;
      }else{
        start = mid+1;
      }
    }
  
    }
    return ans;
    }
    
    }
    
