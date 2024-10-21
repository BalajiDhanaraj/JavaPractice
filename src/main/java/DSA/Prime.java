package DSA;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        int num = input.nextInt();

        if(num <= 1){
            System.out.println("prime");
            return;
        }
        int c = 2;
        while(c*c <= num){
            if(num % c == 0){
                System.out.println("not a prime");
                return;
            }
            c++;
        }
        if (c*c>num){
            System.out.println("prime");
        }

    }




}
