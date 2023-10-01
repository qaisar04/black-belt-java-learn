package WORK_WITH_FILES;

import java.io.*;

public class DataStreamExample5 {
    public static void main(String[] args) {
        // DataInputStram и DataOutputStram позволяют записывать в файл и читать
        // из него примитивные типы данных.

        try (DataOutputStream dataOutputStream = new DataOutputStream(
                new FileOutputStream("my_test.bin"));
             DataInputStream dataInputStream = new DataInputStream(
                     new FileInputStream("my_test.bin"))) {
            dataOutputStream.writeUTF("string");
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeByte(5);
            dataOutputStream.writeDouble(4.5);

            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readDouble());

            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
