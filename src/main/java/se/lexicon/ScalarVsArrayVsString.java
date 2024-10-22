package se.lexicon;

import java.util.Arrays;

public class ScalarVsArrayVsString {
    public static void main(String[] args) {
        System.out.println("Scalar:");
        scalar();
        System.out.println("-----------------------");
        System.out.println("String:");
        string();
        System.out.println("-----------------------");
        System.out.println("Array:");
        array();
    }

    public static void scalar() {
        int scalar = 10;
        System.out.println("scalar: " + scalar);
        int referenceScalar = scalar;
        System.out.println("ref. scalar: " + referenceScalar);
        scalar = 20;
        System.out.println("scalar: " + scalar);
        System.out.println("ref. scalar:" + referenceScalar);
    }

    public static void string() {
        String string = "Fafa";
        System.out.println(string);
        String referenceString = string;
        System.out.println(referenceString);
        string = "HSH";
        System.out.println(string);
        System.out.println(referenceString);

    }

    public static void array() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("array address: " + array);
        System.out.println("array: " + Arrays.toString(array));
        int[] referenceArray = array;
        System.out.println("ref. array address: " + referenceArray);
        System.out.println("ref. array: " + Arrays.toString(referenceArray));
        array[0] = 100;
        System.out.println("array address: " + array);
        System.out.println("array: " + Arrays.toString(array));
        System.out.println("ref. array address: " + referenceArray);
        System.out.println("ref. array: " + Arrays.toString(referenceArray));

    }
}
