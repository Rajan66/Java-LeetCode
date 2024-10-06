package CoreJava;

import java.util.*;

/*
 * This is example of foreach method on Collection Framework
 * Introduced in Java 8,
 * the forEach loop provides programmers with a new, concise
 * and interesting way to iterate over a collection.
 */
public class CollectionExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        Set<String> newFruits = new HashSet<>(Arrays.asList("kiwi", "banana", "strawberry"));
        HashMap<String, String> map = new HashMap<>();

        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");

        fruits.add("apple");
        fruits.add("mango");
        fruits.add("pineapple");
        fruits.add("guava");

        fruits.forEach(fruit -> System.out.println(fruit));
        fruits.forEach(System.out::println);
        newFruits.forEach(System.out::println);

        // this is better
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        // just showing that you can do like this as well.
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));


        /**
         * From a simple point of view,
         * both loops (enhanced for-loop and foreach)
         * provide the same functionality: loop through elements in a collection.
         * The main difference between them is that they are different iterators.
         * The enhanced for-loop is an external iterator, whereas the new forEach method is internal.
         * for more info on this check: https://www.baeldung.com/foreach-java
         */

    }
}
