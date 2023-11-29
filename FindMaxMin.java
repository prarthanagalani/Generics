package Generics;

public class FindMaxMin<T extends Comparable<T>> {

    private T val1, val2, val3;

    // Constructor
    public FindMaxMin(T val1, T val2, T val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    // Generic method to find the max of three values
    public T findMax() {
        T max = val1;

        if (val2.compareTo(max) > 0) {
            max = val2;
        }

        if (val3.compareTo(max) > 0) {
            max = val3;
        }

        return max;
    }

    // Test method to call the static findMax method
    public void testMaximum() {
        System.out.println("Maximum value: " + findMax());
    }

    public static void main(String[] args) {
        // Test Case 1: Given Max Number at 1st Position, return the Same Number
        Integer num1 = 10, num2 = 5, num3 = 8;
        System.out.println("Test Case 1: " );
        FindMaxMin<Integer>findmax = new FindMaxMin<Integer>(num1,num2, num3);
        findmax.testMaximum();

        // Test Case 2: Given Max Number at 2nd Position, return the Same Number
        num1 = 5;
        num2 = 15;
        num3 = 8;
        System.out.println("Test Case 2: ");
        findmax = new FindMaxMin<Integer>(num1,num2, num3);
        findmax.testMaximum();

        // Test Case 3: Given Max Number at 3rd Position, return the Same Number
        num1 = 5;
        num2 = 8;
        num3 = 20;
        System.out.println("Test Case 3: " );
        findmax = new FindMaxMin<Integer>(num1,num2, num3);
        findmax.testMaximum();

        // Test Case 1: Given Max Number at 1st Position, return the Same Number (Float)
        Float floatNum1 = 15.5f, floatNum2 = 5.2f, floatNum3 = 8.9f;
        System.out.println("Test Case 1 (Float): " );
        FindMaxMin<Float>findmaxfloat = new FindMaxMin<Float>(floatNum1, floatNum2, floatNum3);
        findmaxfloat.testMaximum();

        // Test Case 2: Given Max Number at 2nd Position, return the Same Number (Float)
        floatNum1 = 5.2f;
        floatNum2 = 15.7f;
        floatNum3 = 8.1f;
        System.out.println("Test Case 2 (Float): " );
        findmaxfloat = new FindMaxMin<Float>(floatNum1, floatNum2, floatNum3);
        findmaxfloat.testMaximum();

        // Test Case 3: Given Max Number at 3rd Position, return the Same Number (Float)
        floatNum1 = 5.4f;
        floatNum2 = 8.8f;
        floatNum3 = 20.3f;
        System.out.println("Test Case 3 (Float): " );
        findmaxfloat = new FindMaxMin<Float>(floatNum1, floatNum2, floatNum3);
        findmaxfloat.testMaximum();
    }

}
