package WORK_WITH_FILES;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно!\n" +
                "Вот последняя правда, открытая мной\n";

        String s = "Омар Хайям";

        FileWriter writer = null;
        try {
            // в параметрах FileWriter'а стоит вторым то что мы хотим соеденить
            // следущие действия с первым, а не использовать перезапись.
            writer = new FileWriter("/Users/qaisarbaltabay/IdeaProjects/BlackBelt/text1.txt", true);
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }
//            writer.write(rubai);
            writer.write(s);
                System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }  finally {
            writer.close();
        }
    }
}
