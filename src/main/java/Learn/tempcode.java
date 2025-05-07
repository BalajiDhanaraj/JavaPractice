import java.util.*;

public class Main {
  
     public static void main(String[] args) {
                 //0,1,2,3,4,5,6,7
                 //-1,1,3,4
      // int[] arr = {1,2,2,4};
      // int[] val = findErrorNums(arr);
      // // List<Integer> missing = findDisappearedNumbers(arr);
      // // System.out.println(missing);
      // String name = "ehele";
      // double a = 23.34;
      // System.out.printf("hello %.1f",a);
      // System.out.println(Arrays.toString(val));
      
      int ans = printres(1);
      
      System.out.println(ans);
      
  }
  
  
  
  public static int printres(int n){
    
    if(n==5){
      return n;
    }
    
   printres(n+1); 
  }
  
   public static int[] findErrorNums(int[] arr) {
        
                              
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
       //1,2,2,4
       
       for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                System.out.println("hello "+index+1);
                return new int[]{arr[index],index+1};
            }
        }
       
      return  new int[]{-1,-1};
     
    }
    
         public static void Swap(int[] arr, int first,int second){
      
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second] = temp;
      
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
       
      return arr.length;
    }
    
     
    
    
    
    public static int findDuplicate(int[] arr) {
      
      // List<Integer> dup = new ArrayList<Integer>();
                              
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
       
       //0,1,2,3,4,5,6,7
       //1,2,3,4,2
       
       for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
               return arr[index];
            }
        }
       
      return -1;
      
        
    }
    
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

    
          
  
 
}



