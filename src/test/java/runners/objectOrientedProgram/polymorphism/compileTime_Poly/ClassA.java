package runners.objectOrientedProgram.polymorphism.compileTime_Poly;

public class ClassA {

    public  int sum (int a , int b) {
        return a + b;

    }

    public double sum ( double a, int b) {
        return a + b ;
    }

    public int sum (int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public void print() {

        System.out.println("calculator ClassA, super class");
    }
}


