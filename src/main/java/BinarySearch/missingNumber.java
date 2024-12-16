import java.util.*;

public class missingNumber {
  
     public static void main(String[] args) {
                 //0,1,2,3,4,5,6,7
      int[] arr = {9,6,4,2,3,5,7,0,1};
      int val = missingNumber(arr);
      // List<Integer> missing = findDisappearedNumbers(arr);
      // System.out.println(missing);
      System.out.println(val);
      
  }
          
    //Given an integer array nums of length n where all the integers of nums are in the range [1, n] 
    //and each integer appears at most twice,return an array of all the integers that appears twice.
    
    
    
    public static int missingNumber(int[] arr) {
      
        int i = 0;
        
        //0,1,2,3,4,5,6,7
        //1,2,3,4,5
     
       while(i<arr.length){
         
        int correct = arr[i];
        
        if (arr[i] < arr.length && arr[i]!=arr[correct]){
          Swap(arr,i,correct);
        }else{
          i++;
        }
         
       }
       
       //0,1,2,3,4,5,6,7
       //1,2,3,4,2
       
       for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
               return index;
            }
        }
       
      return -1;
    }
    
      public static void Swap(int[] arr, int first,int second){
      
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second] = temp;
      
    }

}
