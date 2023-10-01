package WORK_WITH_FILES;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("text1.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(
                     new FileWriter("text2.txt"));
        ) {
            int character;

            while((character=bufferedReader.read())!=-1) {
                bufferedWriter.write(character);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
