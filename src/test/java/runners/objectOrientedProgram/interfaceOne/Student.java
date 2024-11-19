package runners.objectOrientedProgram.interfaceOne;


public class Student extends GeneralInformation implements CommandersInterface {


    public Student(String firstName, String lastName, int age, String address) {
        super(firstName, lastName, age, address);
    }

    @Override
    public void print() {
        System.out.println("FirstName: " +getFirstName());
        System.out.println("LastName: " +getLastName());
        System.out.println("Age: " +getAge());
        System.out.println("Address: " +getAddress());
        System.out.println("ClassStartTime: " + classStartTime);
        System.out.println("ClassEndTime: " +classEndTime);
        System.out.println("TeacherName: " + teacherName);
        System.out.println("ClassName: " + className);


    }





}
