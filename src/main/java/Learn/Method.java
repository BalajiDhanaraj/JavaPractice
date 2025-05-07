
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Method {
    
    //               the argument ref variable can be anything, but the passing datatype should be same
    static int Sum(int num1, int num2){
        int val = num1+num2;
        return val;
    }
    
    static void Cal(int n1, int n2){
       int sum = n1 + n2;
       System.out.println("sum"+sum);
       int mul = n1*n2;
       System.out.println("mul"+mul);
       if(n2!=0){
          int div = n1/n2;
          System.out.println("mul"+div); 
       }else{
          System.out.println("n2 is 0,"); 
       }
       
    }
    
    public void Swap(int s1, int s2){
        int temp = s1;
        s1 = s2;
        s2 = temp;
        // the swap changes will visible only in the swap method , not outside of the method, 
        /*
        In the case of primitive data types, it copies the value inside stack memory then pass it to the method. 
        In the case of non-primitive data types, it points a reference in stack memory to actual data, which occurs in a heap. 
        When we pass an object, it will copy a reference from the stack memory and pass it to the callee method.
        */
        System.out.println("swapped two numbers"+s1+" "+s2);
    }
    
    public String nameChange(String name){
        
        String fullname = name+"dhanarj";
        
        return fullname;
    }
    
    static void Varargs(int ...a){
        System.out.println("Number of arguments: "
                           + a.length);
 
        // using for each loop to display contents of a
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
    
    static void Overload(int count){
        System.out.println("count "+count);
    }
    static void Overload(int count,String dis){
        System.out.println("count "+count+"dis "+dis);
    }
    

    public static void main(String[] args) {
       
       Method ref = new Method();
       Scanner input = new Scanner(System.in);
       int a = input.nextInt();
       int b = input.nextInt();
       // calling method using class object
         ref.Swap(a,b);
         String name = ref.nameChange("balaji");
         System.out.println("name changed "+name);
       // calling static method with return type
          int val = Sum(a,b);
          System.out.println("sum of two numbers"+val);
       // calling static method with void return type
          Cal(a,b);
          
          Varargs(100);
          Varargs(1,2,3,4,5,6);
          
          
          Overload(100);
          Overload(90,"overload");
       
    }
}
