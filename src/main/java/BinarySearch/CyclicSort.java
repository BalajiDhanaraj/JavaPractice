import java.util.*;

public class Main {
  
  
    public static void main(String[] args) {
      
      int[] arr = {4,3,2,1,5};
      
      //BubbleSort(arr);
      //SelectionSort(arr);
      //InsertionSort(arr);
      CyclicSort(arr);
      System.out.println(Arrays.toString(arr));
      
  }
  
  
  
  public static void CyclicSort(int[] arr){
    
    int i = 0;
    
    while(i<arr.length){
      
      int correct = arr[i]-1;
      
      if(arr[i]!=arr[correct]){
        Swap(arr,i,correct);
      }else{
        i++;
      }
    }
    
  }
  
   
  
 
  
  public static void Swap(int[] arr,int first, int second){
    
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
 
   }
}
