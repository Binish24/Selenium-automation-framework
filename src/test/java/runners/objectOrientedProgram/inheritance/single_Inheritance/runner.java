package runners.objectOrientedProgram.inheritance.single_Inheritance;

public class runner {
    public static void main(String[] args) {

        parentClass obj = new parentClass(
                "Nabiullah",
                "Benish",
                35

        );

        child objOne = new child (
                "Alex",
                "Steve",
                35,
                "Alameda"
        );

        obj.print();
        objOne.print();
    }
}
