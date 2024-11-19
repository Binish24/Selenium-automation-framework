package runners.objectOrientedProgram.inheritance.single_Inheritance;

public class parentClass {

    //Fields

    private String firstName;
    private String lastName;
    private int age;

    //Constructor

    public parentClass (String firstName, String lastName, int age) {

        this.firstName = firstName;
        this.lastName =lastName;
        this.age = age;
    }

    //Getter

    public String getFirstName() { return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}

    //Setter

    public void setFirstName (String firstName) {this.firstName =firstName;}
    public void setLastName (String lastName) {this.lastName =lastName;}
    public void setAge (int age) {this.age = age;}

    public void print () {

        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " +lastName);
        System.out.println("Age: " +age);
    }


}
