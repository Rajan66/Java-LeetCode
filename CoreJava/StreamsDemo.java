package CoreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("potato");
        list.add("mango");
        list.add("apple");
        list.add("chilly");

        System.out.println(list.stream().sorted().toList());
        list.stream().forEach(System.out::println);

        List<String> fruits = list.stream().filter(name -> !name.equals("potato")).collect(Collectors.toList());
        fruits.stream().sorted().forEach(System.out::println);

    }
}
