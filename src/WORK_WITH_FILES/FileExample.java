package WORK_WITH_FILES;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("text1.txt"); // относительный путь
        File folder = new File("/Users/qaisarbaltabay/Desktop/A"); // абсолютный путь
        File nonexistentFile = new File("/Users/qaisarbaltabay/Desktop/A/test90.txt");
        File nonexistentFolder = new File("/Users/qaisarbaltabay/Desktop/B");

        System.out.println(file.getAbsolutePath()); // /Users/qaisarbaltabay/IdeaProjects/BlackBelt/text1.txt
        System.out.println("_________________________________________________");

        System.out.println(file.isAbsolute()); // false -- так как путь не абсолютный
        System.out.println(folder.isAbsolute()); // true
        System.out.println("_________________________________________________");

        System.out.println(file.isDirectory()); // false - так как не является папкой
        System.out.println(folder.isDirectory()); // true
        System.out.println("_________________________________________________");

        System.out.println(file.exists()); // true - так как существует
        System.out.println(nonexistentFile.exists()); // false
        System.out.println("_________________________________________________");

        System.out.println(nonexistentFile.createNewFile()); // создания файла
        System.out.println(nonexistentFolder.mkdir()); // создания директории
        System.out.println("_________________________________________________");

        System.out.println(nonexistentFile.length()); // размер файла
        System.out.println(folder.length());
        System.out.println("_________________________________________________");

        // удаление папки возможно если там внутри нет файлов
        System.out.println(nonexistentFile.delete()); // удаление
        System.out.println(nonexistentFolder.delete());
        System.out.println("_________________________________________________");

        System.out.println(nonexistentFile.createNewFile()); // создания файла
        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        // [/Users/qaisarbaltabay/Desktop/A/.DS_Store, /Users/qaisarbaltabay/Desktop/A/I created it myself, /Users/qaisarbaltabay/Desktop/A/test90.txt]
        System.out.println("_________________________________________________");

        System.out.println(nonexistentFile.isHidden()); // проверяет скрыт ли этот файл
        System.out.println(nonexistentFile.canRead()); // права на чтение
        System.out.println(nonexistentFile.canWrite()); // права на запись
        System.out.println(nonexistentFile.canExecute()); // права на запуск файла










    }
}
