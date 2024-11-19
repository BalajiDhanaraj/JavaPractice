import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class linearSearch {


    static int linearSearch1(int[] arr,int target){

        if(arr.length==0){
            return -1;
        }

        for (int index=0;index<arr.length;index++) {
            if(arr[index]==target){
                return index+1;
            }
        }

        return -1;
    }

     static int linearSearch2(int[] arr,int target){

        if(arr.length==0){
            return -1;
        }

        for (int element : arr) {
            
            if(element==target){
                return element;
            }
        }

         // incase if the target element is -1, to over come the these scenaior 
         // we are using random value of max value.
        return Integer.MAX_VALUE;
    }


    
    public static void main(String[] args) {

        int[] arr = {10,4,13,55,34,2};
        int target = 99;
        int ans1 = linearSearch1(arr,target);
        System.out.println("index value"+ans1);
        int target2 = 99;
        int ans2 = linearSearch2(arr,target2);
        System.out.println("actual array value"+ans2);

    }

    
}
