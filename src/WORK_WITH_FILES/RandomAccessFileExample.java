package WORK_WITH_FILES;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")) {

            int a = file.read();
            System.out.println((char) a);

            String st1 = file.readLine();
            System.out.println(st1);

            file.seek(101); // меняем указатель на позицию 101
            String st2 = file.readLine();
            System.out.println(st2);

            long position = file.getFilePointer();
            System.out.println(position);

//            file.seek(0);
//            file.writeBytes("Hi! ");  -- замена

            file.seek(file.length() - 1);
            file.writeBytes("\n          Author:  ");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
