package runners.objectOrientedProgram.encapsulation;

public class Runner {

    public static void main(String[] args) {

            Encapsulation employeeOne = new Encapsulation(
                    "Mohammad",
                    "Mohammadi",
                    25
            );
            Encapsulation employeeTwo = new Encapsulation(
                    "Sam",
                    "Struck",
                    35
            );
            Encapsulation employeeThree = new Encapsulation(
                    "Keller",
                    "Tony",
                    45
            );

            employeeOne.print();
            employeeTwo.print();
            employeeThree.print();

            System.out.println(employeeOne.getFirstName());

            //As below still we can bring changes in values, but
            //encapsulation emphasise we have to keep our variables
            //private and protect them from any changes which will be
            // happened by user!

//        EmployeeOne.firstName = "Ahmad";
//        EmployeeOne.lastName = "Mohammadi";
//        EmployeeOne.age =23;
//
//        EmployeeTwo.firstName = "SAM";
//        EmployeeTwo.lastName = "Struck";
//        EmployeeTwo.age =20;
//
//
//        EmployeeThree.lastName ="Keller";
//        EmployeeThree.age= 45;


            //Once we changed our variables to private, since then
            //we have no longer access to the variables and values directly.
            //In such situation we have to use getter, to get the value
            // and setter, to modify the value.

            //System.out.println(EmployeeOne.firstName);

            //Once we created the get method, now we have access to our values;

            System.out.println(employeeOne.getFirstName());
            System.out.println(employeeOne.getLastName());
            System.out.println(employeeOne.getAge());

//        //Once we create our Setter method, then can modify
//        //our values;
//        //since the variables are private, and we have no access
//        //to the values, just we can modify it.
//
            employeeOne.setFirstName("Jalil Ahmad");
            employeeOne.setLastName("Qazi Zada");
            employeeOne.setAge(33);

            employeeOne.print();
            employeeTwo.print();
            employeeThree.print();

    }
}
