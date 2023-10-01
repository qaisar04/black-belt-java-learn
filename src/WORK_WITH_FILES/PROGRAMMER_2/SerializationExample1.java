package WORK_WITH_FILES.PROGRAMMER_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample1 {
    public static void main(String[] args) {
        List<String> employeeName;
        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employees1.bin")
        )) {
            employeeName = (ArrayList) inputStream.readObject();
            System.out.println(employeeName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
