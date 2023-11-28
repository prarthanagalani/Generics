package Generics;

public class FindMaxMin {

     // Generic method to find the max of three values
     public static <T extends Comparable<T>> T findMax(T val1, T val2, T val3) {
        T max = val1;

        if (val2.compareTo(max) > 0) {
            max = val2;
        }

        if (val3.compareTo(max) > 0) {
            max = val3;
        }

        return max;
    }

    public static void main(String[] args) {
        // Test Case 1: Given Max Number at 1st Position, return the Same Number
        Integer num1 = 10, num2 = 5, num3 = 8;
        System.out.println("Test Case 1: " + findMax(num1, num2, num3));

        // Test Case 2: Given Max Number at 2nd Position, return the Same Number
        num1 = 5;
        num2 = 15;
        num3 = 8;
        System.out.println("Test Case 2: " + findMax(num1, num2, num3));

        // Test Case 3: Given Max Number at 3rd Position, return the Same Number
        num1 = 5;
        num2 = 8;
        num3 = 20;
        System.out.println("Test Case 3: " + findMax(num1, num2, num3));
    }

}
