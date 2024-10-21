package DSA;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        int num = input.nextInt();

        /*
        prime or not
        prime is the number is divide by 1 or itself
        num = 4
          4 <= 1
          4 is greater than 1

          or

          1 <= 1
          1 is equal to 1
          so its is prime

         */
        if(num <= 1){
            System.out.println("prime");
            return;
        }
        /*
         c = 2 --> count from 2 still number
         while ( c * c <= num) --> 4 * 4 <= 4 --> its equal to 4
         if( num % c == 0 ) --> 4 % 2 == 0  --> % modulo will give remainder 0 or 1 --> 4 % 2 will give 0 so, it not
         a prime number;

         */
        int c = 2;
        while(c*c <= num){
            if(num % c == 0){
                System.out.println("not a prime");
                return;
            }
            c++;
        }
        /*
         if ( c * c > num ) --> 4 * 4 will give 16 > 17
         */
        if (c*c>num){
            System.out.println(c*c > num);
            System.out.println(num < c *c);
            System.out.println("prime");
        }

    }




}
