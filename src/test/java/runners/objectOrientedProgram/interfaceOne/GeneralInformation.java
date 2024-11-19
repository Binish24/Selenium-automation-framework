package runners.objectOrientedProgram.interfaceOne;

public abstract class GeneralInformation {

    //Fields
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    //Constructor

    public GeneralInformation(String firstName, String lastName, int age, String address) {
        this.firstName =firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    //Getter

    public String getFirstName () {return firstName;}
    public String getLastName () {return lastName;}
    public int getAge () {return age;}
    public String getAddress () {return address;}

    //Setter

    private void setFirstName (String firstName) {this.firstName =getFirstName();}
    private void setLastName(String lastName) {this.lastName =getLastName();}
    private void setAge (int age) {this.age = getAge();}
    private void setAddress (String address) {this.address =getAddress();}

    public abstract void print();

}
