package WORK_WITH_FILES.PROGRAMMER_2;


import WORK_WITH_FILES.PROGRAMMER_1.Employee;

import java.io.*;
import java.util.List;

public class SerializationExample2 {
    public static void main(String[] args) {
        Employee employee;

        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employees2.bin")
        )) {
           Employee bestEmployee = (Employee) inputStream.readObject();
            System.out.println(bestEmployee);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
