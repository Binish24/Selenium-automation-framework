package runners.objectOrientedProgram.interfaceOne;

public class Runner {
    public static void main(String[] args) {

        Student obj = new Student(
                "Mike",
                "Binish",
                25,
                "Alameda"

        );

        obj.print();
    }
}
