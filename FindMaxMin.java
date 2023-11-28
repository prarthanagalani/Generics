package Generics;

public class FindMaxMin {
    
    // Use Case 1: Find max of 3 integers
    public static Integer findMax(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;

        if (num2.compareTo(max) > 0) {
            max = num2;
        }

        if (num3.compareTo(max) > 0) {
            max = num3;
        }

        return max;
    }

    // Use Case 2: Find max of 3 float values
    public static Float findMax(Float num1, Float num2, Float num3) {
        Float max = num1;

        if (num2.compareTo(max) > 0) {
            max = num2;
        }

        if (num3.compareTo(max) > 0) {
            max = num3;
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

        // Test Case 1: Given Max Number at 1st Position, return the Same Number (Float)
        Float floatNum1 = 15.5f, floatNum2 = 5.2f, floatNum3 = 8.9f;
        System.out.println("Test Case 1 (Float): " + findMax(floatNum1, floatNum2, floatNum3));

        // Test Case 2: Given Max Number at 2nd Position, return the Same Number (Float)
        floatNum1 = 5.2f; floatNum2 = 15.7f; floatNum3 = 8.1f;
        System.out.println("Test Case 2 (Float): " + findMax(floatNum1, floatNum2, floatNum3));

        // Test Case 3: Given Max Number at 3rd Position, return the Same Number (Float)
        floatNum1 = 5.4f; floatNum2 = 8.8f; floatNum3 = 20.3f;
        System.out.println("Test Case 3 (Float): " + findMax(floatNum1, floatNum2, floatNum3));
    }

}