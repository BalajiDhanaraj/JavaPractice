package Arrays;

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class EvenNum {

    static int EvenNums(int[] arr){

        int count =0;
        for (int nums : arr) {
            if(even(nums)){
                count++;
            }
        }

        return count;
    }

    static boolean even(int nums){

        int numberOfDigit = digit(nums);

        // if(numberOfDigit % 2 == 0){
        //     return true;
        // }
        // return false;
        return numberOfDigit%2==0;
    }

    static int digit(int nums){

        if(nums<0){
            nums = nums * -1;
        }

        if(nums == 0){
            return 1;
        }

        int count =0;

        while (nums>0) {
            count++;
            nums=nums/10;
        }

        return count; 
    }

//// static int digit(int nums){
//
//        if(nums<0){
//            nums = nums * -1;
//        }
//        return (int)(Math.log10(nums))+1;
//    }


    
    public static void main(String[] args) {

        int[] arr = {12, 5, 1234, 123456};
            
         int EvenDig = EvenNums(arr);
        System.out.println("EvenDig "+EvenDig);
        
    }
}
