package runners.objectOrientedProgram.inheritance.multiLevel_Inheritance;

public class multilevelInheritance extends child {

    //Field
    private String phoneNumber;

    //Constructor
    public multilevelInheritance (
            String firstName,
            String lastName,
            int age,
            String location,
            String phoneNumber
    ) {
        super (firstName, lastName, age, location);
        this.phoneNumber = phoneNumber;
    }

    //Getter
    public String getPhoneNumber () {
        return phoneNumber;
    }

    //Setter
    private void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void print() {
        super.print();
        System.out.println("PhoneNumber: " +getPhoneNumber());
    }
}

