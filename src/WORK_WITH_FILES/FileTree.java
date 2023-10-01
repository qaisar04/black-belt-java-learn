package WORK_WITH_FILES;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileTree {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/qaisarbaltabay/Desktop/M");
        Files.walkFileTree(path, new MyFileVisitor());
    }
}

class MyFileVisitor implements FileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Enter to directory: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error file visiting: " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exit from directory: " + dir);
        return FileVisitResult.CONTINUE;
    }
}

    /* вывод
    Enter to directory: /Users/qaisarbaltabay/Desktop/M
    File name: .DS_Store
    File name: m_file2.txt
    Enter to directory: /Users/qaisarbaltabay/Desktop/M/M2
    File name: .DS_Store
    File name: name_file 2_m2
    File name: name_file_m2
    Exit from directory: /Users/qaisarbaltabay/Desktop/M/M2
    Enter to directory: /Users/qaisarbaltabay/Desktop/M/M3
    Exit from directory: /Users/qaisarbaltabay/Desktop/M/M3
    File name: m_file
    Exit from directory: /Users/qaisarbaltabay/Desktop/M
    */

