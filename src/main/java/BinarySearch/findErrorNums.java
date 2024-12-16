package BinarySearch;

import java.util.*;

public class findErrorNums {

//   645. Set Mismatch
// Solved
// Easy
// Topics
// Companies
// You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.

// Find the number that occurs twice and the number that is missing and return them in the form of an array.


// Example 1:

// Input: nums = [1,2,2,4]
// Output: [2,3]
// Example 2:

// Input: nums = [1,1]
// Output: [1,2]

    public static void main(String[] args) {
        //0,1,2,3,4,5,6,7
        //-1,1,3,4
        int[] arr = {1, 1};
        int[] val = findErrorNums(arr);
        // List<Integer> missing = findDisappearedNumbers(arr);
        // System.out.println(missing);
        System.out.println(Arrays.toString(val));

    }


    public static int[] findErrorNums(int[] arr) {


        int i = 0;

        //0,1,2,3,4,5,6,7
        //1,2,3,4,5

        while (i < arr.length) {

            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                Swap(arr, i, correct);
            } else {
                i++;
            }

        }

        //{4,3,2,7,8,2,3,1};
        //0,1,2,3,4,5,6,7
        //1,2,2,4

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[]{arr[index], index + 1};
            }
        }

        return new int[]{-1, -1};

    }

    public static void Swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
