package GENERICS.GAMES;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Bob",11);
        Schoolar schoolar2 = new Schoolar("Patrick",15);
        Student student1 = new Student("Sam",19);
        Student student2 = new Student("Rio",18);
        Employee employee1 = new Employee("Kros", 29);
        Employee employee2 = new Employee("Lose", 32);


        Team<Schoolar> schoolarTeam1 = new Team<>("Dragon");
        schoolarTeam1.addNewParticipant(schoolar1);
        schoolarTeam1.addNewParticipant(schoolar2);

        Team<Student> studentTeam = new Team<>("Kazakhstan");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Sun");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        использование generics не дает возможность добавить в команду Employee студента
//        Team<String> stringTeam = new Team<>("Fantasy");  -----> class Team <T extends Participant>

        Schoolar schoolar3 = new Schoolar("Kate",13);
        Schoolar schoolar4 = new Schoolar("Sasha",12);
        Team<Schoolar> schoolarTeam2 = new Team<>("GoodTeam");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam2.playWith(schoolarTeam2);
//      schoolarTeam2.playWith(studentTeam); <----- mistake















    }
}
