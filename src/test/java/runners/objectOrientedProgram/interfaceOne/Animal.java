package runners.objectOrientedProgram.interfaceOne;

interface Animal {

    public void sound();
    public void eat ();
    public void sleep();
    public void run ();

}

class Dog implements Animal {

    public void sound(){
        System.out.println("dogs are barking!");
    }
    public void eat () {
        System.out.println("dogs are eating!");
    }
    public void sleep () {
        System.out.println("dogs are sleeping!");
    }

    public void run () {
        System.out.println("Dogs are running!");
    }

}

class Cow implements Animal {

    public void sound () {
        System.out.println("Cows have their own sounds!");
    }
    public void eat () {
        System.out.println("Cows are eating a lot!");
    }
    public void sleep () {
        System.out.println("Cows are sleeping many hours!");
    }
    public void run () {
        System.out.println("Cows are running very fast!");
    }

}

//This is the main method, whenever it did not run, we have to separate the classes individually and then run the method
//public class Main {
//    public static void main (String[] args){
//
//        Dog d = new Dog();
//        d.sound();
//        d.eat();
//        d.sleep();
//        d.run();
//
//
//        Cow c = new Cow();
//        c.sound();
//        c.eat();
//        c.sleep();
//        c.run();
//    }
//}




