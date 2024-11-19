package runners.objectOrientedProgram.inheritance.multiLevel_Inheritance;

public class child extends parent {

    //Field
    private String location;

    //Constructor
    public child (String firstName, String lastName, int age, String location) {
        super(firstName, lastName, age);
        this.location = location;
    }

    //Getter
    private String getAddress () {
        return location;}

    //Setter

    private void setAddress (String location) {
        this.location = location;
    }

    public void print () {
        super.print();
        System.out.println("Location: " + location);
    }


}
