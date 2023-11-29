package Generics;

import java.util.List;
import java.util.Optional;
import java.util.Arrays;
import java.util.Collections;

public class FindMaxMin<T extends Comparable<T>> {

    private List<T> values;

    // Constructor
    public FindMaxMin(T... values) {
        this.values = Arrays.asList(values);
    }

    // Generic method to find the max of three values
    public T findMax() {
        if (values.isEmpty()) {
            return null;
        }

        Collections.sort(values, Collections.reverseOrder());

        return values.get(0);
    }

    // Test method to call the static findMax method
    public void testMaximum() {
        T max = findMax();
        if (max != null) {
            printMax(max);
        } else {
            System.out.println("No maximum value found");
        }
    }

    private void printMax(T max) {
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        // Test Case 1: Given Max Number at 1st Position, return the Same Number

        System.out.println("Test Case 1: ");
        FindMaxMin<Integer> findmax = new FindMaxMin<Integer>(1, 2, 3, 4, 5);
        findmax.testMaximum();

        // Test Case 1: Given Max Number at 1st Position, return the Same Number (Float)

        System.out.println("Test Case 1 (Float): ");
        FindMaxMin<Float> findmaxfloat = new FindMaxMin<Float>(1.5f, 4.5f, 15.6f);
        findmaxfloat.testMaximum();

        // Test Case 1: Given Max String at 1st Position, return the Same String

        System.out.println("Test Case 1 (String): ");
        FindMaxMin<String> findmaxstring = new FindMaxMin<String>("cat", "dog", "car", "apple", "orange");
        findmaxstring.testMaximum();

    }

}
