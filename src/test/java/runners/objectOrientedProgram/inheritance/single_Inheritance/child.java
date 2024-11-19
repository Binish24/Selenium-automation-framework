package runners.objectOrientedProgram.inheritance.single_Inheritance;


public class child extends parentClass {

    private String address;

    public child (String firstName, String lastName, int age, String address) {
        super( firstName, lastName, age);
        this.address = address;
    }

    private String getAddress () {
        return address;
    }

    private void setAddress (String address) {

        this.address =address;
    }

    public void print () {
        super.print();
        System.out.println("Address: " + getAddress());
    }
}
