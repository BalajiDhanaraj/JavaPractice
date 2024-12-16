package Sorting;

import java.util.*;

public class findDuplicates {
  
     public static void main(String[] args) {
      
      int[] arr = {1,1,2,3,4,2};
      //Sorting.findDuplicates(arr);
      List<Integer> dupVal = findDuplicates(arr);
      System.out.println(dupVal);
      //System.out.println(Arrays.toString(arr));
      
  }
  
// 442. Find All Duplicates in an Array
// Solved
// Medium
// Topics
// Companies
// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

// You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output



// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]
// Example 2:

// Input: nums = [1,1,2]
// Output: [1]
// Example 3:

// Input: nums = [1]
// Output: []

    public static List<Integer> findDuplicates(int[] arr) {
        
        List<Integer> dup = new ArrayList<Integer>();
        
        int i = 0;
        
        //0,1,2,3,4,5,6,7
        //1,2,3,4,5
     
       while(i<arr.length){
         
        int correct = arr[i]-1;
        
        if (arr[i]!=arr[correct]){
          Swap(arr,i,correct);
        }else{
          i++;
        }
         
       }
       
       
       for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                dup.add(arr[index]);
            }
        }
       
      return dup;
    }
    
    
    public static void Swap(int[] arr, int first,int second){
      
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second] = temp;
      
    }

    
}

