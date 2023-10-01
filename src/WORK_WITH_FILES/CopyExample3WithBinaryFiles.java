package WORK_WITH_FILES;

import java.io.*;

public class CopyExample3WithBinaryFiles {
    public static void main(String[] args) {

        // работа с бинарными файлами [неправильный ход решение]

        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("/Users/qaisarbaltabay/Downloads/2023-09-25 18.06.26.jpg"));
             BufferedWriter bufferedWriter = new BufferedWriter(
                     new FileWriter("chatGPT.jpg"));
        ) {
            int character;
            while ((character = bufferedReader.read()) != -1) {
                bufferedWriter.write(character);
            }

            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

