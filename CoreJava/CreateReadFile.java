package CoreJava;

import java.io.*;
import java.util.Scanner;

public class CreateReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("hello.txt");

            file.createNewFile(); // if the file exists it does nothing.


            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            /***
             No need to use String Builder as the
             string gets added to the file immediately without concatenation
             StringBuilder line = new StringBuilder();
             line += "hei" (useful in these cases inside a loop)
             */

            String line;
            System.out.println("------------------------------------------------------------------------");
            while (true) {
                Scanner sc = new Scanner(System.in);
                line = sc.nextLine();
                if (line.equals("end")) {
                    break;
                }

                bufferedWriter.write(line);
                bufferedWriter.newLine();

//                line.setLength(0);
            }

            bufferedWriter.close();
            fileWriter.close();

            System.out.println("------------------------------------------------------------------------");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("------------------------------------------------------------------------");

            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
