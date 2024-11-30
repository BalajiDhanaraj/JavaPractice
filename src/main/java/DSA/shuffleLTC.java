 import java.util.*;
    import java.lang.*;
    import java.io.*;
    import java.util.Scanner;
    // The main method must be in a class named "Main".
    public class shuffleLTC {
  //       Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
  
  // Return the array in the form [x1,y1,x2,y2,...,xn,yn].
  // Example 1:
  
  // Input: nums = [2,5,1,3,4,7], n = 3
  // Output: [2,3,5,4,1,7] 
  // Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
    
    public static void main(String[] args) {

    
    int[] nums = {2,5,1,3,4,7};
                //[2,3,5,4,1,7].
                // 0,1,2,3,4,5,6
    int n = 3;
    
    int[] ans = shuffle(nums,n);
    
    System.out.println(Arrays.toString(ans));
    
    }
     public static int[] shuffle(int[] nums, int n) {
       
       
        int temp[]=new int[2*n];
        int i=0;
        int j=n;
        for(int k=0;k<2*n;k++)
        {
        if(k%2==0)
        {
        temp[k]=nums[i++];
        }
        else
        {
        temp[k]=nums[j++];
        }
        }
        return temp;
       
      // int[] ans = new int[nums.length];
        
       
      // for (int i=0;i<n;i++){
        
      //   ans[2*i] = nums[i];
      //   ans[(2*i) + 1] = nums[i + n];
         
      // } 
       
      // return  ans;
    }
