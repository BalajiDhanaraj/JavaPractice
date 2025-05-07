package StringConcept;
import java.util.*;
public class StringConcepts {


public static void main(String[] args) {



Comparsion();
Operators();

}
  
  public static void Comparsion(){
    
    /** String is immutbale --> we cant change/modify the stirng 
        String is stored in string pool
          --> there are two memory allocation in java --> stack -- heap 
               Stack is will store the reference eg int a = 10; --> reference
               heap -> will store the value for 10 
               Whereas String will store in String Pool which is inside the heap --> for SecurityManager
               
    
    **/
    String a = "balaji";
    String b = "balaji";
    
    // a == b will be true --> because the a and b will point/refering the same value in string pool 
    
    System.out.println(a == b);
    
    
    String a1 = "balaa1";
    
    String b1 = a1;
    
    b1 = "balaa12";
    a1 = b1;
    
    System.out.println(a1==b1);
    
    // StringBuilder will create new object in heap memory insteadof stirng pool
    // so the change/modify the string will possible now
    
    StringBuilder name1 = new StringBuilder("balaji");
    StringBuilder name2 = new StringBuilder("balaji");

    
    System.out.println(name1==name2);
    
    System.out.println(name1.equals(name2));
    
  
  }
  
  public static void Operators() {
    
          /*
      
      in java only one operand is overloaded --> "+" --> for string only --> while c++ and python will support the operator overlaoding
      
      */
      
      // 'a' the char will converted into interger value and perform the + with 1 
      System.out.println('a'+1);
      // 'a' the char will converted into interger value and perform the + with 1 
      System.out.println((char)('b'+5));
      // "a" the string will remain same as a and added with 3  --> a3
      System.out.println("a"+3);
       // integer will be converted to Integer that will call toString()
       //when a interger is concented with "added" with string , its converted to its wrapper class Integer
      System.out.println("a"+'b');
      
      
      //System.out.println( Integer(56)+" "+ new ArrayList<>());
   
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);

        System.out.println("a" + 'b');
}
  
  
  public static void format(){
    
    
    // There are many format specifiers we can use. Here are some common ones:
    
    // %c - Character
    // %d - Decimal number (base 10)
    // %e - Exponential floating-point number
    // %f - Floating-point number
    // %i - Integer (base 10)
    // %o - Octal number (base 8)
    // %s - String
    // %u - Unsigned decimal (integer) number
    // %x - Hexadecimal number (base 16)
    // %t - Date/time
    // %n - Newline
    
    float a = 453.1274f;
    System.out.printf("Formatted number is %.2f", a);
    
    System.out.printf("Pie: %.3f", Math.PI);

  }
  

  
}
