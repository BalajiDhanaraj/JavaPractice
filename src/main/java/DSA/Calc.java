// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Calc {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //System.out.println();
      int ans = 0;
      while(true){
      System.out.println("Enter the calc symbols +,-,/,%");
      char sym = input.next().trim().charAt(0);

       if (sym == '+' || sym == '-' || sym == '*' || sym == '/' || sym == '%') {
           
            System.out.println("enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            if(sym == '+'){
            ans = num1 + num2;
            }
            if(sym == '-'){
            ans = num1 - num2;
            }
            if(sym == '*'){
            ans = num1 * num2;
            }
            if(sym == '/'){
            if(num2!=0){
            ans = num1/num2;
            }else{
                System.out.println("Num2 is 0, we cant divide "+num2);
            }
            }
            if(sym == '%'){
            if(num2!=0){
            ans = num1%num2;
            }
            }
       }else if(sym == 'x' || sym == 'X'){
           break;
       }else{
           System.out.println("invalid operator, please enter valid one!!!");
       }
       System.out.println("answer"+ans);
      }
    }
}
