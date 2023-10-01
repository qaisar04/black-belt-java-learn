package WORK_WITH_FILES;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesExample1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("/Users/qaisarbaltabay/Desktop/M");

        System.out.println(filePath.getFileName()); // test15.txt
        System.out.println(directoryPath.getFileName()); // M
        System.out.println("__________________________");

        System.out.println(filePath.getParent()); // null
        System.out.println(directoryPath.getParent()); // /Users/qaisarbaltabay/Desktop
        System.out.println("__________________________");

        System.out.println(filePath.getRoot()); // null
        System.out.println(directoryPath.getRoot()); // /
        System.out.println("__________________________");

        System.out.println(filePath.isAbsolute()); // false
        System.out.println(directoryPath.isAbsolute()); // true
        System.out.println("__________________________");

        System.out.println(filePath.toAbsolutePath()); // /Users/qaisarbaltabay/IdeaProjects/BlackBelt/test15.txt
        System.out.println(directoryPath.toAbsolutePath()); // /Users/qaisarbaltabay/Desktop/M
        System.out.println("__________________________");

        System.out.println(filePath.toAbsolutePath().getParent()); // /Users/qaisarbaltabay/IdeaProjects/BlackBelt
        System.out.println(filePath.toAbsolutePath().getRoot()); // /
        System.out.println("__________________________");

        System.out.println(directoryPath.resolve(filePath)); // /Users/qaisarbaltabay/Desktop/M/test15.txt
        System.out.println("__________________________");

        Path anotherPath = Paths.get("/Users/qaisarbaltabay/Desktop/M/N/Z/test15.txt");
        System.out.println(directoryPath.relativize(anotherPath)); // N/Z/test15.txt
        System.out.println("__________________________");

        if (!Files.exists(filePath)) {  // exists - существует
            Files.createFile(filePath);
        }

        if (!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }

        System.out.println("__________________________");

        // права на чтение, записи и запуска файла
        System.out.println(Files.isReadable(filePath));
        System.out.println(Files.isWritable(filePath));
        System.out.println(Files.isExecutable(filePath));


        System.out.println("__________________________");
        Path filePath2 = Paths.get("/Users/qaisarbaltabay/IdeaProjects/BlackBelt/test15.txt");
        System.out.println(Files.isSameFile(filePath, filePath2)); // true

        System.out.println("__________________________");
        System.out.println(Files.size(filePath)); // получаем размер файла


        System.out.println("__________________________");
        System.out.println(Files.getAttribute(filePath,  "creationTime")); // 2023-09-27T16:17:11Z
        System.out.println(Files.getAttribute(filePath,  "size")); // размер файла

        System.out.println("__________________________");
        Map<String, Object> attributes = Files.readAttributes(filePath,  "*"); //  получаем все атрибуты

        for(Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("__________________________");





















    }
}
