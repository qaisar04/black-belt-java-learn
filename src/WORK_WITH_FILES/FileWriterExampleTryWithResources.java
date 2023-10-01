package WORK_WITH_FILES;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExampleTryWithResources {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно!\n" +
                "Вот последняя правда, открытая мной\n";

        String s = "Омар Хайям";

        try (FileWriter writer = new FileWriter("text1.txt", true)) {
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
