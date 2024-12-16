package Arrays;

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class SearchInString {


    static boolean SearchInString1(String name,char target){

        if(name.length()==0){
            return false;
        }

        for (int index=0;index<name.length();index++) {
            if(name.charAt(index)==target){
                return true;
            }
        }

        return false;
    }

    static String SearchInString2(String name,char target){

        if(name.length()==0){
            return null;
        }

        for (char ch : name.toCharArray()) {
            if(ch==target){
                return String.valueOf(ch);
            }
        }

        return null;
    }
    

  
    
    public static void main(String[] args) {

        String name = "Balajiwalker";
        char target = 'w';

        System.out.println("boolean fun "+SearchInString1(name,target));

        String ans = SearchInString2(name,target);
        System.out.println("return the char "+ans); 
    }
}
