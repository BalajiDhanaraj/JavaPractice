// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class CountNums {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the numbers");
      int num = input.nextInt();
      System.out.println("Enter the number to find the total counts");
      int check = input.nextInt();
      int count = 0;
      int sum = 0;
      while(num>0){
          int rem = num%10;
          if(rem==check){
              count++;
              sum = sum + check;
          }
          num = num/10;
      } 
      System.out.println("Count "+count+"sum "+sum);
    }
}
