import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class MaxWealth {

    static int maxWealth1(int[][] bank){

        int max = 0;
        for (int account=0;account<bank.length;account++) {
            int sum = 0;
            for (int person=0;person<bank[account].length;person++) {
                sum+= bank[account][person];  
            }
            if(sum>max){
                max = sum;  
            }
        }
        return max;
    }

    
    public static void main(String[] args) {

        int[][] arr = {
            {111,3,4},
            {2,1,20},
            {5,10,411}
        
        };

        int ans = maxWealth1(arr);
        System.out.println("maxWealth "+ans);
        
    }
}
