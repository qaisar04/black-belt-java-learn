package WORK_WITH_FILES.PROGRAMMER_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample1 {
    public static void main(String[] args) {
        List<String> employeeName = new ArrayList<>();
        employeeName.add("Bob");
        employeeName.add("Kate");
        employeeName.add("Patrick");
        employeeName.add("Ivan");

        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees1.bin"))) {
            outputStream.writeObject(employeeName);
            System.out.println("Done");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
