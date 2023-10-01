package WORK_WITH_FILES;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyExample4WithBinaryFiles {
    public static void main(String[] args) {
        // FileInputStram и FileOutputStram используются для работы с бинарными файлами.
        try(FileInputStream fileInputStream =
                    new FileInputStream("/Users/qaisarbaltabay/Downloads/2023-09-25 18.06.26.jpg");
            FileOutputStream fileOutputStream = new FileOutputStream("chatGPT.jpg")
            ) {
            int i;
            while(((i=fileInputStream.read())!=-1)) {
                fileOutputStream.write(i);
            }

            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
