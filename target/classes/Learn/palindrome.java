import java.util.*;


public class palindrome{

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

  public static Boolean palim(int x){
    
    
    if(x<0 || (x>0 && x%10==0)){
     return false;
    }
    
    int y = 0;
    
    while(y<x){
      y = y * 10 + x % 10;
      x = x/10;
    }
    
    return x == y || x == y/10;
    
    
  }
  
  public static void main(String args[]){
    
    Boolean val = palim(123);
    
    System.out.println(val);
    
    
              
  // Input: x = 121
  // Output: true
  // Explanation: 121 reads as 121 from left to right and from right to left.
    
    // int x = 123;
    
    // String org = Integer.toString(x);
    
    // String dup = "";
    
    // while(x>0){
    //   int rem = x%10;
    //   dup += rem;
    //   x = x/10;
    // }
    
    // if(org.equals(dup)){
    //   System.out.println(true);
    // }else{
    //   System.out.println(false);
    // }
    
   
  }
}

