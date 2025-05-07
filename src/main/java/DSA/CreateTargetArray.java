    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    import java.util.Scanner;
    // The main method must be in a class named "Main".
    
    public class CreateTargetArray {
      
    public static void main(String[] args) {

    int[] nums = {0,1,2,3,4};
                //0,1,2,3,4,
    int[] index = {0,1,2,2,1};
  
    int[] answer = createTargetArray(nums,index);
    
    System.out.println(Arrays.toString(answer));
    
    }
    
    
// Given two arrays of integers nums and index. Your task is to create target array under the following rules:

// Initially target array is empty.
// From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
// Repeat the previous step until there are no elements to read in nums and index.
// Return the target array.

// It is guaranteed that the insertion operations will be valid.
    
    public static int[] createTargetArray(int[] nums, int[] index) {
      
      
      int[] target = new int[nums.length];
      
      for (int i=0;i<nums.length;i++){
        
        if(index[i]==i){
          target[i] = nums[i];
        }else{
          for(int j=index[i];j<i+1;j++){
            
            int temp = target[j];
            target[j] = nums[i];
            nums[i] = temp;
            
           // System.out.println(index[i]);
            
            
            
          }
          
        }
        
        
      } 
      
  
      return target;  
    }
    }
    
