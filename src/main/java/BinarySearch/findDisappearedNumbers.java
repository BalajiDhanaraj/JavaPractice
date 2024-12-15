import java.util.*;

public class findDisappearedNumbers {


//   448. Find All Numbers Disappeared in an Array
// Solved
// Easy
// Topics
// Companies
// Hint
// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
// Example 2:

// Input: nums = [1,1]
// Output: [2]
  
     public static void main(String[] args) {
                 //0,1,2,3,4,5,6,7
      int[] arr = {1,1};
      //findDuplicates(arr);
      List<Integer> missing = findDisappearedNumbers(arr);
      System.out.println(missing);
      //System.out.println(Arrays.toString(arr));
      
  }
          
    //Given an integer array nums of length n where all the integers of nums are in the range [1, n] 
    //and each integer appears at most twice,return an array of all the integers that appears twice.
    
    
    public static List<Integer> findDisappearedNumbers(int[] arr) {
     
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
       
        //{4,3,2,7,8,2,3,1};
       //0,1,2,3,4,5,6,7
       //1,2,3,4,2,7,8
       
       for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                dup.add(index+1);
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
