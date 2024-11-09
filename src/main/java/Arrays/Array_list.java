package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        System.out.println("Enter the list of items");
        for(int i=0;i<list.size();i++){
            list.add(input.nextInt());
        }

        for(int j=0;j<list.size();j++){
            System.out.println("list of items "+list.get(j));
        }

    }

}
