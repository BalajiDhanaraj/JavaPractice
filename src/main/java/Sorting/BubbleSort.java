package Sorting;

import java.util.*;

public class BubbleSort {
  
  
    public static void main(String[] args) {
      
      int[] arr = {1,2,4,3,5};
      
      int[] ans = BubbleSort(arr);
      System.out.println(Arrays.toString(ans));
      
  }
  
  
  public static int[] BubbleSort(int[] arr){
    
    boolean swapped;
    
    for (int i=0;i<arr.length;i++){
      swapped = false;
      for (int j=1;j<arr.length-i;j++){
        
        if (arr[i]<arr[j]){
          
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j-1] = temp;
          
          swapped = true;
          
        } 
      }
      
      if(!swapped){
        break;
      }
      
    } 
    
    
    
    
    return arr;
  }
  
  
}
