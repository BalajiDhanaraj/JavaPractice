import java.util.*;

public class Main {
  
  
    public static void main(String[] args) {
      
      int[] arr = {5,4,3,2,1};
    
      SelectionSort(arr);
      System.out.println(Arrays.toString(arr));
      
  }
  
  
  public static void SelectionSort(int[] arr){
    
    for(int i=0;i<arr.length;i++){
      
      int last = arr.length-1-i;
      
      int max = MaxValue(arr,0,last);
      
      Swap(arr,max,last);
      
    }

    //return arr;
  }
  
  public static void Swap(int[] arr,int first, int second){
    
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
 
   }
  
  public static int MaxValue(int[] arr,int start, int last){
    
    int max = start;
    
    for(int i=start;i<=last;i++){
      
      if(arr[max]<arr[i]){
        max = i;
      }
      
    }
    
   return max; 
  }
  
  }
  
