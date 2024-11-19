package runners.objectOrientedProgram.abstraction;

public class Runner {
    public static void main(String[] args) {

        Employee employee = new Employee(
                "Mike",
                "Alex",
                "Alameda",
                25
        );

        Employee employeeTwo = new Employee(
                "Sam",
                "Trover",
                "Clinton avenue",
                34
        );

        employee.print();
        employeeTwo.print();

    }
}
