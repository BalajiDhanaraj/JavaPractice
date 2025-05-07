package DSA;

import java.util.*;
    import java.lang.*;
    import java.io.*;
    import java.util.Scanner;
    // The main method must be in a class named "Main".

// 1929. Concatenation of Array
// Solved
// Easy
// Topics
// Companies
// Hint
// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

// Specifically, ans is the concatenation of two nums arrays.

// Return the array ans.


    public class ConcatenationLTC {
      
    
    public static void main(String[] args) {

    
    int[] nums = {1,3,2,1};
    
    int[] ans = getConcatenation(nums);
    
    System.out.println(Arrays.toString(ans));
    
    }
    
      public static int[] getConcatenation(int[] nums) {
        // ans[i] == nums[i] and ans[i + n] == nums[i]
        int[] ans = new int[nums.length*2];
        System.out.println(ans.length);
        
        int count = 0;
        int count1 = 0;
          for(int i=0;i<ans.length;i++){
             
            if(count<=nums.length-1){
              ans[i] = nums[i];
              count++;
            }else{
              
              ans[i] = nums[count1];
              count1++;
            }
        }
       
        return ans;
    }
    
//      public static int[] getConcatenation(int[] nums) {
//      int ans[] = new int[(nums.length)*2];
//      int n = nums.length;
//      for(int i=0;i<nums.length;i++) {
//      ans[i] = nums[i];
//      ans[n+i] = nums[i];
//      }
//      return ans;
//      }
      

   
    }
    
