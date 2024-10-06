package CoreJava;

public class AutoBoxUnBox {
    public static void main(String[] args) {
        /**
         *  AutoBoxing/Unboxing when assigned to a variable fo the corresponding type
         * */
        int a = 9;
        Integer aObj = a; // this is autoboxing
        // or
        a = aObj; // this is unboxing

        System.out.println("Primitive: " + a);
        System.out.println("Wrapper Class:" + aObj.getClass());

        // compiler does autoboxing when you pass the value to the params.
        int result = add(aObj, a);
        System.out.println(result);
    }

    private static int add(Integer a, Integer b) {
        // here as well returns the value as a primitive type
        return a + b;
    }

}
