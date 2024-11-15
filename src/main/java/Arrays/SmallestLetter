    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    // The main method must be in a class named "Main".
    public class Main {
    
    
    public static void main(String[] args) {
      
      
                    //0,1,2,3,4,5,  6,7,
    char[] letter = {'a','b','c','d','f'};
    
    char target = SmallestLetter(letter,'e');
    
    System.out.println("FindFirstAndLastPos "+target);
    
    
    }
    
   // find-smallest-letter-greater-than-target
   /*
   
    a b c d e f --> our target is e --> SmallestLetter, but its no in array, so we are find the greater
    than target letter --> so we are getting the greter letter is f.
    if we cant find the target in the letter , we will return the first letter in char[]
    
   */
    static char SmallestLetter(char[] letter,char target){
    
    int start = 0;
    int end = letter.length-1;
  
    while (start<=end) { 
    
    int mid = start + (end - start) / 2;
    
    
    if(target<letter[mid]){
      end = mid-1;
    }else if(target>letter[mid]){
      start = mid+1;
    }
    }
    
    // 
    return letter[start%letter.length];
    }
    
    }

//https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=++++import+java.util.*%3B%0A++++import+java.lang.*%3B%0A++++import+java.io.*%3B%0A++++%0A++++//+The+main+method+must+be+in+a+class+named+%22Main%22.%0A++++public+class+Main+%7B%0A++++%0A++++%0A++++public+static+void+main(String%5B%5D+args)+%7B%0A++++++%0A++++++%0A++++++++++++++++++++//0,1,2,3,4,5,++6,7,%0A++++char%5B%5D+letter+%3D+%7B'a','b','c','d','f'%7D%3B%0A++++%0A++++char+target+%3D+SmallestLetter(letter,'e')%3B%0A++++%0A++++System.out.println(%22FindFirstAndLastPos+%22%2Btarget)%3B%0A++++%0A++++%0A++++%7D%0A++++%0A+++//+find-smallest-letter-greater-than-target%0A+++/*%0A+++%0A++++a+b+c+d+e+f+--%3E+our+target+is+e+--%3E+SmallestLetter,+but+its+no+in+array,+so+we+are+find+the+greater%0A++++than+target+letter+--%3E+so+we+are+getting+the+greter+letter+is+f.%0A++++if+we+cant+find+the+target+in+the+letter+,+we+will+return+the+first+letter+in+char%5B%5D%0A++++%0A+++*/%0A++++static+char+SmallestLetter(char%5B%5D+letter,char+target)%7B%0A++++%0A++++int+start+%3D+0%3B%0A++++int+end+%3D+letter.length-1%3B%0A++%0A++++while+(start%3C%3Dend)+%7B+%0A++++%0A++++int+mid+%3D+start+%2B+(end+-+start)+/+2%3B%0A++++%0A++++%0A++++if(target%3Cletter%5Bmid%5D)%7B%0A++++++end+%3D+mid-1%3B%0A++++%7Delse+if(target%3Eletter%5Bmid%5D)%7B%0A++++++start+%3D+mid%2B1%3B%0A++++%7D%0A++++%7D%0A++++%0A++++//+%0A++++return+letter%5Bstart%25letter.length%5D%3B%0A++++%7D%0A++++%0A++++%7D%0A++++&mode=display&curInstr=30
