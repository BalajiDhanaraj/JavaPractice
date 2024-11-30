    import java.util.*;
    import java.lang.*;
    import java.io.*;
    import java.util.Scanner;
    // The main method must be in a class named "Main".
    public class Main {

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.
// Example 1:
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    
    public static void main(String[] args) {

    
    int[] nums = {1,2};
    int[] ans = runningSum(nums);
    
    System.out.println(Arrays.toString(ans));
    
    }
      
      public static int[] runningSum(int[] nums) {
        
        
        for (int i=0;i<nums.length-1;i++){
          
          int temp = nums[i]+nums[i+1];
          
          nums[i+1] = temp;
          
        } 
        
        return nums;
        
    }
      
    }
    
    
    
