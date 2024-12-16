import java.util.*;

public class firstMissingPositive {

//   41. First Missing Positive
// Solved
// Hard
// Topics
// Companies
// Hint
// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 

// Example 1:

// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.
// Example 2:

// Input: nums = [3,4,-1,1]
// Output: 2
// Explanation: 1 is in the array but 2 is missing.
// Example 3:

// Input: nums = [7,8,9,11,12]
// Output: 1
// Explanation: The smallest positive integer 1 is missing.
  
     public static void main(String[] args) {
                 //0,1,2,3,4,5,6,7
                 //-1,1,3,4
      int[] arr = {7,8,9,11,12};
      int val = firstMissingPositive(arr);
      // List<Integer> missing = findDisappearedNumbers(arr);
      // System.out.println(missing);
      System.out.println(val);
      
  }
          

    
    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        
        //0,1,2,3,4,5,6,7
        //1,2,3,4,5
     
       while(i<arr.length){
         
        int correct = arr[i]-1;
        
        if (arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
          Swap(arr,i,correct);
        }else{
          i++;
        }
         
       }
       
       
       for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
               return index+1;
            }
        }
       
      return arr.length+1;
    }
    
     public static void Swap(int[] arr, int first,int second){
      
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second] = temp;
      
    }
}
