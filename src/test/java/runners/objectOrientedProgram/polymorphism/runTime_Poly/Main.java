package runners.objectOrientedProgram.polymorphism.runTime_Poly;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Cow cow = new Cow();

        animal.makeSound();
        cow.makeSound();
    }
}
