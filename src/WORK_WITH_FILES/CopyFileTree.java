package WORK_WITH_FILES;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("/Users/qaisarbaltabay/Desktop/M");
        Path destination = Paths.get("/Users/qaisarbaltabay/Desktop/CopyHere");
        Files.walkFileTree(source, new MyFileVisitor2(source, destination));
        System.out.println("Done!");
    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {
    Path source; // источник
    Path destination; // место назначения (то есть куда будем копировать)

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir)); // destination + относительный путь dir
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING); // в параметрах что мы копируем и куда
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file)); // destination + относительный путь dir
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING); // в параметрах что мы копируем и куда
        return FileVisitResult.CONTINUE;
    }
}
