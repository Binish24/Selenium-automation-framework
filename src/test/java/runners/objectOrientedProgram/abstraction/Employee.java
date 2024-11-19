package runners.objectOrientedProgram.abstraction;

public class Employee extends GeneralInformation{

    private String employees;
    //Constructor
    public Employee (String firstName, String lastName, String address, int age) {
        super (firstName, lastName,address,age);
    }

    @Override
    public void print() {

        System.out.println(" * * * * * Employee * * * * *");
        System.out.println("FirstName: " + getFirstName());
        System.out.println("LastName: " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("Age: " + getAge());
    }

    public void printEmployee() {
        System.out.println(" We have: " + employees);
    }
}
