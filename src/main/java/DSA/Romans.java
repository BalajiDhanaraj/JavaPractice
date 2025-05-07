import java.util.*;

public class Romans {

    public static void Roman(String val) {
      
        int preval = 0;
        int currentval = 0;
        int total = 0;
        // Check if the string contains only valid Roman numeral characters
        if (val.matches("[IVXLCDM]+")) {
            for (int j = val.length()-1; j>=0; j--) {
                char character = val.charAt(j);

                switch (character) {
                    case 'I':
                        currentval = 1;
                        break;
                    case 'V':
                        currentval= 5;
                        break;
                    case 'X':
                        currentval= 10;
                        break;
                    case 'L':
                        currentval= 50;
                        break;
                    case 'C':
                        currentval = 100;
                        break;
                    case 'D':
                        currentval = 500;
                        break;
                    case 'M':
                        currentval = 1000;
                        break;
                    default:
                        break;
                }
              if(currentval<preval){
              total = total-currentval;
              
            }else{
              total = total+currentval;
            }
            preval = currentval;
            
          }
          
           System.out.println(total);
           
        } else {
            System.out.println("Invalid Roman numeral");
        }
        
       
  }
  public static void main(String args[]){
    
    // Boolean val = palim(123);
    
    // System.out.println(val);
    
    String s = "MCMXCIV";
    Roman(s);
    
    
   
  }
}


// import java.util.*;

// public class Romans {

//     public static int romanToInt(String s) {
//         // Map to store Roman numerals and their integer values
//         Map<Character, Integer> romanMap = new HashMap<>();
//         romanMap.put('I', 1);
//         romanMap.put('V', 5);
//         romanMap.put('X', 10);
//         romanMap.put('L', 50);
//         romanMap.put('C', 100);
//         romanMap.put('D', 500);
//         romanMap.put('M', 1000);

//         int total = 0;
//         int prevValue = 0;

//         // Iterate through the string from right to left
//         for (int i = s.length() - 1; i >= 0; i--) {
//             int currentValue = romanMap.get(s.charAt(i));

//             // If the current value is less than the previous value, subtract it
//             if (currentValue < prevValue) {
//                 total -= currentValue;
//             } else {
//                 // Otherwise, add it
//                 total += currentValue;
//             }

//             // Update the previous value
//             prevValue = currentValue;
//         }

//         return total;
//     }

//     public static void main(String[] args) {
//         String s1 = "III";
//         String s2 = "LVIII";
//         String s3 = "MCMXCIV";

//         System.out.println(s1 + " = " + romanToInt(s1)); // Output: 3
//         System.out.println(s2 + " = " + romanToInt(s2)); // Output: 58
//         System.out.println(s3 + " = " + romanToInt(s3)); // Output: 1994
//     }
// }

// public class Romans {

//     public static int romanToInt(String s) {
//         int total = 0;
//         int prevValue = 0;

//         // Iterate through the string from right to left
//         for (int i = s.length() - 1; i >= 0; i--) {
//             int currentValue = getRomanValue(s.charAt(i));

//             // If the current value is less than the previous value, subtract it
//             if (currentValue < prevValue) {
//                 total -= currentValue;
//             } else {
//                 // Otherwise, add it
//                 total += currentValue;
//             }

//             // Update the previous value
//             prevValue = currentValue;
//         }

//         return total;
//     }

//     // Method to get the integer value of a Roman numeral character
//     public static int getRomanValue(char roman) {
//         switch (roman) {
//             case 'I':
//                 return 1;
//             case 'V':
//                 return 5;
//             case 'X':
//                 return 10;
//             case 'L':
//                 return 50;
//             case 'C':
//                 return 100;
//             case 'D':
//                 return 500;
//             case 'M':
//                 return 1000;
//             default:
//                 return 0; // This case should never be hit if input is guaranteed to be valid
//         }
//     }

//     public static void main(String[] args) {
//         String s1 = "III";
//         String s2 = "LVIII";
//         String s3 = "MCMXCIV";

//         System.out.println(s1 + " = " + romanToInt(s1)); // Output: 3
//         System.out.println(s2 + " = " + romanToInt(s2)); // Output: 58
//         System.out.println(s3 + " = " + romanToInt(s3)); // Output: 1994
//     }
// }










