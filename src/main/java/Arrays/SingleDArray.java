package Arrays;// Online Java Compiler
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
    
    static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
        
        return arr;
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
   
    public static void main(String[] args) {
        SingleDArray ref = new SingleDArray();
        ref.basicArray();
    
        int[] arr = new int[]{1,5,11,100,2,4};
        System.out.println("max with start and end range"+maxRange(arr,2,5));
        System.out.println("max"+max(arr));
        arr = reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
