package runners.objectOrientedProgram.inheritance.multiLevel_Inheritance;

import java.lang.instrument.ClassDefinition;

public class driver {
    public static void main(String[] args) {

        parent objOne = new parent(
                "Alex",
                "Sam",
                35
        );

        child objTwo = new child(
                "Mike",
                "trover",
                53,
                "Alameda"
        );

        multilevelInheritance objThree = new multilevelInheritance(
                "Michel",
                "Tony",
                45,
                "San Fransaco",
                "4234312312"
        );

        objOne.print();
        objTwo.print();
        objThree.print();

    }
}
