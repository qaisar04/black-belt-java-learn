package WORK_WITH_FILES;

import java.io.*;

public class CopyExample2 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("text1.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(
                     new FileWriter("text2.txt"));
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

