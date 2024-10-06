package CoreJava;

/**
 * VarArgs in Java
 * Varargs help us avoid writing boilerplate code
 * by introducing the new syntax that can handle an arbitrary number of
 * parameters automatically – using an array under the hood.
 */

public class VarArgs {
    public static void main(String[] args) {
        /**
         * Varargs are straightforward to use. But there are a few rules we have to keep in mind:
         *
         * - Each method can only have one varargs parameter
         * - The varargs argument must be the last parameter
         */

        int[] a = {5, 5, 5, 5, 5};

        int result = sum(1, 1);
        System.out.println(result);
    }

    private static int sum(int a, int b, int... value) {
        int sum = a + b;
        for (Integer c : value) {
            sum += c;
        }
        return sum;
    }
}
