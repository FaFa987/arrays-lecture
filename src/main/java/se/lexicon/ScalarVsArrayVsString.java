package se.lexicon;

import java.util.Arrays;

public class ScalarVsArrayVsString {
    public static void main(String[] args) {
        System.out.println("Scalar");
        scalar();
        System.out.println("-----------------------");
        System.out.println("String");
        string();
        System.out.println("-----------------------");
        System.out.println("Array");
        array();
    }

    public static void scalar() {
        int scalar = 10;
        System.out.println(scalar);
        int referenceScalar = scalar;
        System.out.println(referenceScalar);
        scalar = 20;
        System.out.println(scalar);
        System.out.println(referenceScalar);
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
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        int[] referenceArray = array;
        System.out.println(referenceArray);
        System.out.println(Arrays.toString(referenceArray));
        array[0] = 100;
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        System.out.println(referenceArray);
        System.out.println(Arrays.toString(referenceArray));

    }
}
