// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Largest {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number");
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();
      int d = input.nextInt();
      
    //   int max = 0;
    //   max = a;
    //   if(b>max){
    //       max = b;
    //   }
      
    //   if(c>max){
    //       max = c;
    //   }
    
    int max1 = 0;
    int max2 = 0;
    if(a>b){
        max1 = a;
    }else{
        max1 = b;
    }
    
    if(c>d){
        max2 = c;
    }else{
        max2 = d;
    }
    
    if(max1>max2){
         System.out.println(max1);
    }else{
         System.out.println(max2);
    }
   
    }
}
