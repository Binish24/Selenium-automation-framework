package runners.objectOrientedProgram.abstraction;

public abstract class GeneralInformation {

    //Field
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    //Constructor

    public GeneralInformation(String firstName, String lastName, String address, int age) {
        this.firstName = firstName;
        this.lastName =lastName;
        this.address =address;
        this.age =age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress () {
        return address;
    }

    public int getAge () {
        return age;
    }

    private void setFirstName (String firstName) {
        this.firstName =firstName;
    }
    private void setLastName (String lastName) {
        this.lastName = lastName;
    }
    private void setAddress (String address) {
        this.address = address;
    }
    private void setAge (int age) {
        this.age = age;
    }

    public abstract void print ();



}
