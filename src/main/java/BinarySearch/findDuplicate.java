import java.util.*;

public class findDuplicate {
  
     public static void main(String[] args) {
                 //0,1,2,3,4,5,6,7
      int[] arr = {3,1,3,4,2};
      int val = findDuplicate(arr);
      // List<Integer> missing = findDisappearedNumbers(arr);
      // System.out.println(missing);
      System.out.println(val);
      
  }

    
    public static int findDuplicate(int[] arr) {
      
                              
        int i = 0;
        
        //0,1,2,3,4,5,6,7
     
       while(i<arr.length){
         
        int correct = arr[i]-1;
        
        if (arr[i]!=arr[correct]){
          Swap(arr,i,correct);
        }else{
          i++;
        }
         
       }
       
       //0,1,2,3,4,5,6,7
       //1,2,3,4,2
       
       for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
               return arr[index];
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
