package WORK_WITH_FILES;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExample1 {
    public static void main(String[] args) {
        try(RandomAccessFile file =
                    new RandomAccessFile("test10.txt", "rw");
            FileChannel channel = file.getChannel()
        ) {
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder poem = new StringBuilder();
            int byteRead = channel.read(buffer);
            while(byteRead > 0) {
                System.out.println("Read: "  + byteRead);
                buffer.flip();

                while (buffer.hasRemaining()) {
                   poem.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }

            System.out.println(poem);

            String text = "\nJust compare heart, beard, and heard,\n" +
                    "Dies and diet, lord and word,\n" +
                    "Sword and sward, retain and Britain.\n" +
                    "(Mind the latter, how it's written.)\n" +
                    "Now I surely will not plague you\n" +
                    "With such words as plaque and ague.\n" +
                    "But be careful how you speak:\n" +
                    "Say break and steak, but bleak and streak;\n" +
                    "Cloven, oven, how and low,\n" +
                    "Script, receipt, show, poem, and toe\n" +
                    "          Author:  ";

//            1 способ
//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes()); // запись в буффер
//            buffer2.flip(); // не нужно делать флип
//            channel.write(buffer2);

//            2 способ
            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
