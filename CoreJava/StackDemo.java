package CoreJava;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
//        Stack s = new Stack();
//        s.push("hi");
//        s.push(1);
//        System.out.println(s.peek());
//        System.out.println(s);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            int number = Integer.parseInt(row);
            number = (int) Math.pow(number, 3);


            System.out.println(number);
        }
    }
}
