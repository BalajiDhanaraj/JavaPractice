// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.ArrayList;
class SingleDArray {
    
    
    public void basicArray(){
        Scanner input = new Scanner(System.in);
        
        int[] a = new int[5];
        
        System.out.println("enter a list of item in an array");
        for(int i=0;i<a.length;i++){
            a[i] = input.nextInt();
        }
        // printing the array
        for(int num : a){
            System.out.println(num);
        }
        // using Array.toString()
        System.out.println(Arrays.toString(a));
        
    }
    
    static int maxRange(int[] a, int start, int end){
        
        if(start>end){
            return -1;
        }
        if(a==null){
            return -1;
        }
        
        int max = a[start];
        
        for(int i=start;i<=end;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        
        return max;
    }
    
    static int max(int[] a){
       
        if(a.length == 0){
            return -1;
        }
        
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        
        return max;
    }
    
   
    public static void main(String[] args) {
        SingleDArray ref = new SingleDArray();
       Scanner input = new Scanner(System.in);
       
       //ref.basicArray();
    
        int[] a = new int[]{1,5,11,100,2,4};
        System.out.println("max with start and end range"+maxRange(a,2,5));
        System.out.println("max"+max(a));
    //   ArrayList<Integer> list = new ArrayList<>(5);
       
    //   System.out.println("Enter the list of items");
    //   for(int i=0;i<list.size();i++){
    //       list.add(input.nextInt());
    //   }
    
    //     for(int j=0;j<list.size();j++){
    //       System.out.println("list of items "+list.get(j));
    //   }
       
    }
}
