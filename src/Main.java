import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> texts = new ArrayList<>();


        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                texts.add(line.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            for (String text : texts) {
                writer.write(text);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
