package runners.objectOrientedProgram.encapsulation;

public class Encapsulation {

        ///Fields
        private String firstName;
        private String lastName;
        private int age;

        //Constructor
//    public Encapsulation() {
//        this.firstName ="";
//        this.lastName ="";
//        this.age=0;
//    }

        public Encapsulation(String firstName, String lastName, int age) {

            //setFirstName(firstName);
            this.firstName = firstName;
            this.lastName= lastName;
            this.age = age;
        }

        //Get the value --> Getter

        public String getFirstName() {
            return firstName; //    / return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        //Modify the value --> Setter
        public void setFirstName(String firstName){

            //if (firstName == null){
//          //  System.out.println("The firstName cannot be null!");
//        // this.firstName ="";
//        ////
//        //throw IllegalArgumentException("FirstName cannot be null!");
//        //} else {this.firstName=firstName;
//        //   }
//        // }
            this.firstName=firstName;
        }

        public void setLastName(String lastName){

            this.lastName=lastName;
        }

        public void setAge(int age){

            this.age= age;
        }

        /// Method to print the values of variables
        public void print(){

            System.out.println("FirstName: " +firstName);
            System.out.println("LastName: " +lastName);
            System.out.println("Age: " +age);
        }

}
