// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Fibo {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      System.out.println("Enter the number");
      int num = input.nextInt();
      int a = 0;
      int b = 1;
      int count = 2;

      while(count<=num){
        // we storing the b in temp --> 1 <-- = 1
        int temp = b;
        // b = b+a --> b = 1 + 0 --> so b = 1 now
        b = b + a;
        // now we reassgin the a = temp , 1 <-- = 1
        a = temp;
        // count will increase until num
        count++;
      }
      
      System.out.println(b);
    }
}
