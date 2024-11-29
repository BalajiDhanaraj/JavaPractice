    import java.util.*;
    import java.lang.*;
    import java.io.*;
    import java.util.Scanner;
    // The main method must be in a class named "Main".
    public class FindAreaFormula {
      
    
    public static void main(String[] args) {

    AreaofCircle();
    AreaOfTriangle();
    AreaOfRectangle();
    AreaOfIsoscelesTriangle();
    AreaOfParallelogram();
    AreaOfRhombus();
    AreaOfEquilateralTriangle();
    
    
    }
    
    static void AreaofCircle(){
      
      // formula  area = PI(r^2);
      
      double radius = 100;
      double area = 3.1416*(radius*radius);
      
      System.out.println("area of Circle "+area);
    }
    
    static void AreaOfTriangle(){
      
      // formula = h*b/2;
      
      double base = 5;
      double heigth = 6;
      
      double Triangle = (base*heigth)/2;
      
      System.out.println("AreaOfTriangle "+Triangle);
      
    }
    
    static void AreaOfRectangle(){
      
      // formula = w*l
      
      double width = 10;
      double length = 15;
      
      double Rectangle = width*length;
      
      System.out.println("AreaOfRectangle "+Rectangle);
    }
    
    static void AreaOfIsoscelesTriangle(){
      
      // formula = b*h/2;
      
      double base = 55;
      double heigth = 6;
      
      double Triangle = (base*heigth)/2;
      
      System.out.println("AreaOfIsoscelesTriangle "+Triangle);
    }
    
    static void AreaOfParallelogram(){
      
      // formula = h*b/2;
      
      double base = 12;
      double heigth = 10;
      
      double Parallelogram = (base*heigth);
      
      System.out.println("AreaOfParallelogram "+Parallelogram);
      
      
      
    }
    
    static void AreaOfRhombus(){
      
      // formula = p*q/2;
      
      double diagonalP = 3;
      double diagonalQ = 4;
      
      double Rhombus = (diagonalP*diagonalQ)/2;
      
      System.out.println("AreaOfRhombus "+Rhombus);
      
      
    }
    
    static void AreaOfEquilateralTriangle(){
      
      // formula = Root(3)/4 * a^2;
      
      double area = 14;
      
      double EquilateralTriangle = 1.732/4 * (area*area);
      
      System.out.println("AreaOfEquilateralTriangle "+EquilateralTriangle);
      
      
    }
    
    
    
    
   
    

}
