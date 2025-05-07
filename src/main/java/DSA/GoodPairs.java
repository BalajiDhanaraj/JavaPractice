    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    import java.util.Scanner;
    // The main method must be in a class named "Main".


// 1512. Number of GoodPairs
// Solved
// Easy
// Topics
// Companies
// Hint
// Given an array of integers nums, return the number of good pairs.

// A pair (i, j) is called good if nums[i] == nums[j] and i < j.
// Example 1:

// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
// Example 2:

// Input: nums = [1,1,1,1]
// Output: 6
// Explanation: Each pair in the array are good.
// Example 3:

// Input: nums = [1,2,3]
// Output: 0
 
    
    public class GoodPairs {
      
    public static void main(String[] args) {

    int[] nums = {1,1,1,1};
                //0,1,2,3,4,
   // int n = 3;
  
    int answer = numIdenticalPairs(nums);
    
    System.out.println(answer);
    
    }
    
    public static int numIdenticalPairs(int[] nums) {
      
      int ans = 0;
      
      for (int i=0;i<nums.length;i++){
        
        for(int j=i+1;j<nums.length;j++){
          
          if(nums[i]==nums[j]){
            
            ans++;
            
          }
        
        }
        
      } 
      return ans;
        
    }
    
    }
    
