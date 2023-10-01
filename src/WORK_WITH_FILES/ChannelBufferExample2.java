package WORK_WITH_FILES;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExample2 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test5.txt", "r");
             FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get()); // a
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.rewind(); // позиция становится на нулевую ячейку (перемотка)
            System.out.println((char) buffer.get()); // a

            System.out.println("_________________________");
            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while(buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
            System.out.println("_________________________");

            buffer.clear(); // удаление всех элементов из буфера
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get()); // g
            buffer.mark(); // поставили отметку
            System.out.println((char) buffer.get()); // h
            System.out.println((char) buffer.get()); // i
            buffer.reset(); // возвращаемся к отметке
            System.out.println((char) buffer.get()); // h
            System.out.println((char) buffer.get()); // i
            System.out.println((char) buffer.get()); // j
            System.out.println("_________________________");















        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
