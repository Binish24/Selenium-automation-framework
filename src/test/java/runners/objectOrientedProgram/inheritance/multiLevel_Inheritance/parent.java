package runners.objectOrientedProgram.inheritance.multiLevel_Inheritance;

public class parent {
    //Fields
    private String firstName;
    private String lastName;
    private int age;

    //Constructor
    public parent (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName =lastName;
        this.age = age;
    }

    //Getter
    private String getFirstName () { return firstName;}
    private String getLastName () { return lastName;}
    private int getAge() {return age;}

    //Setter

    public void setFirstName (String firstName) {this.firstName =firstName;}
    public void setLastName (String lastNameName) {this.lastName =lastName;}
    public void setAge (int age) {this.age = age;}

   public void print() {

       System.out.println("FirstName: " + firstName);
       System.out.println("LastName: " + lastName);
       System.out.println("Age: " + age);
   }


}


