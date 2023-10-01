package WORK_WITH_FILES;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesExample3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test111.txt");
        Files.createFile(filePath);
        String dialog = "-Hi!\n-Hi\n-How are you?\n-I am fine!\n-Cool!";

        Files.write(filePath, dialog.getBytes());

         List<String> list = Files.readAllLines(filePath);
         for (String s : list) {
             System.out.println(s);
         }
    }
}
