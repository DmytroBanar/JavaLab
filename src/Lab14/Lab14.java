package Lab14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Lab14 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Введений рядок: " + line);

                StringTokenizer tokenizer = new StringTokenizer(line);
                System.out.print(" Рядок складається з:");

                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    try {
                        double number = Double.parseDouble(token);
                        System.out.print("\n" + number + " - це число = " + number);
                    } catch (NumberFormatException e) {
                        System.out.print("\n" + token + " - не є числом");
                    }
                }
                System.out.println("\n");
            }
            reader.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Файл не знайдений");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
