package Pattern;

public class AllPatternCode {
  
     public static void main(String[] args) {
      

      Starleft(5);
      InvertStartleft(5);
      
      Startright(5);
      InvertStartright(5);
      
      TriangleUP(5);
      Triangledown(5);
      
      pattern30(5);
      
  }
  
   public static void Starleft(int n){
     
     
     
     for (int row=0;row<n;row++){
       
       for(int col=0;col<row+1;col++){
         
        System.out.print(" *");
         
       }
       
       System.out.println();
       
     } 
     
     
   }
   
      public static void InvertStartleft(int n){
     
    // System.out.println("   ");
     
     for (int row=0;row<n;row++){
       
       for(int col=0;col<n-row;col++){
         
        System.out.print(" *");
         
       }
       
       System.out.println();
       
     } 
     
     
   }
   
   
   public static void Startright(int n){
     
     
     
     for (int row=0;row<n;row++){
       
       for(int space=0;space<n-row;space++){
       System.out.print("  ");
     }
       
       for(int col=0;col<=row;col++){
         
        System.out.print(" *");
         
       }
       
       System.out.println();
       
     }
     
     
   }
  
  public static void InvertStartright(int n){
     
     
     
     for (int row=0;row<n;row++){
       
      for(int space=0;space<row+1;space++){
      System.out.print("  ");
    }
       
       for(int col=0;col<n-row;col++){
         
        System.out.print(" *");
         
       }
       
       System.out.println();
       
     }
     
     
   }
   
   public static void TriangleUP(int n){
     
     
     
     for (int row=0;row<n;row++){
       
       for(int space=0;space<n-row;space++){
       System.out.print(" ");
     }
       
       for(int col=0;col<=row;col++){
         
        System.out.print("* ");
         
       }
       
       System.out.println();
       
     }
     
     
   }
   
   public static void Triangledown(int n){
     
     
     
     for (int row=0;row<n;row++){
       
      for(int space=0;space<row+1;space++){
      System.out.print(" ");
    }
       
       for(int col=0;col<n-row;col++){
         
        System.out.print("* ");
         
       }
       
       System.out.println();
       
     }
     
     
   }
   
   static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

}
