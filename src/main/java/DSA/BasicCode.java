    import java.util.*;
    import java.lang.*;
    import java.io.*;
    import java.util.Scanner;
    // The main method must be in a class named "Main".
    public class Main {
      
    
    public static void main(String[] args) {

    EvenOrOdd();
    PTR();
    INRTOUSD();
    fibo();
    Palindrome();
    Armstrong();
    }
    
    
    public static void EvenOrOdd(){
      
    // Write a program to print whether a number is even or odd, also take input from the user.
    
    Scanner n = new Scanner(System.in);
    System.out.println("enter a num1 ");
    int num1 = n.nextInt();
    int num2 = num1%2;
    
    if (num2==1){
    System.out.println("odd "+num2);
    }else{
    System.out.println("even "+num2);
    }
    
    

    }
    
    public static void PTR(){
      //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
      
      float principal = 1000;
      float time = 5;
      float rate = 5;
      
      float SI = (principal*time*rate)/100;
      
      System.out.println("Simple Interest "+SI);
    }
    
    
    public static void INRTOUSD(){
      // Input currency in rupees and output in USD.
      
      double inr = 10000;
      double usd = inr*0.012;
      
      System.out.println(usd);
      
    }
    
    public static void fibo(){
      
      // To calculate Fibonacci Series up to n numbers.
      
      int n = 10;
      int first = 0;
      int second = 1;
     
      for (int i=1;i<=n;i++){
        
        System.out.print(first +" ");
         int nextVal = first + second;
         first = second;
         second = nextVal;
      } 
      
      
    }
    
    public static void Palindrome(){
      //To find out whether the given String is Palindrome or not.
      
      String name = "madam";
      
      System.out.println(name.length()-1);
      String rev = ""; 
      
      for (int i=name.length()-1;i>=0;i--){
        
        rev += name.charAt(i);
        
      } 
      
      if(name.equals(rev)){
        System.out.println("string is Palindrome "+name);
      }else{
        System.out.println("string is not Palindrome "+rev);
      }

    }
    
    public static void Armstrong(){
      //To find Armstrong Number between two given number.
      
      String num = "153";
      
      int val = Integer.parseInt(num);

      System.out.println(val);
      int sum = 0;
        
      while(val>0){
      int rem = val%10;
      sum += (rem*rem*rem);
      val = val/10;
      }  
      
      System.out.println("sum "+sum); 
        
        
      if(val==sum){
            System.out.println(""+sum+" is an Armstrong number.");
      }else{
         System.out.println(""+sum+" is not an Armstrong number.");
      }
      
      
    }
    
    
    
    
    
    

}
    
