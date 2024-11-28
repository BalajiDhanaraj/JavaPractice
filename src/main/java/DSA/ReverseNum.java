package DSA;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class ReverseNum {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number");
      int num = input.nextInt();
      int ans = 0;
      while(num>0){
          int rem = num%10;
          num /=10;
          ans = ans*10 + rem;
      }
      System.out.println(ans);
    }
}
