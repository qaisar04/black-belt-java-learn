package WORK_WITH_FILES.PROGRAMMER_1;


import java.io.*;

public class SerializationExample2 {
    public static void main(String[] args) {
        Car car = new Car("BMW", "Black");
        Employee employee = new Employee("Bob", "IT", 28, 500, car);
            // public class Car implements Serializable
            // public class Employee implements Serializable
        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees2.bin")
        )) {
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
