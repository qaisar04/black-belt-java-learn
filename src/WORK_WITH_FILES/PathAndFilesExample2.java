package WORK_WITH_FILES;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesExample2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("/Users/qaisarbaltabay/Desktop/M");

//        Files.copy(filePath, directoryPath.resolve(filePath));
//        Files.copy(filePath, directoryPath.resolve("name_file"),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.copy(directoryPath, directoryPath.resolve("B"));

//        Files.move(filePath, directoryPath.resolve("test15.txt")); // перемещение файла filePath в directoryPath

        // с помощью move идет переменование
//        Files.move((Paths.get("testMove.txt")), (Paths.get("testMove2.txt")));

        Files.delete(Paths.get("deleteFile.txt"));

        System.out.println("Done!");



    }
}
