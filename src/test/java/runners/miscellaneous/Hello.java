package runners.miscellaneous;

public class Hello {

    public static void main(String[] args) {


//        int number = (15 + 14) / (15 +10);
//        double numberOne = 15.12 + 14.13;
//        String name ="Nabiullah";
//        String lastName = "Benish";
//
//        System.out.println(number);
//        System.out.println(numberOne);
//
//        System.out.println(name + " Benish");
//        System.out.println(name + " " +lastName);



//        int firstVariable = (5+10) / (2+2);
//        int secondVariable = 20;
//        int finalVariable = firstVariable-secondVariable;
//
//        System.out.println(finalVariable);


        String name = "Ahmad";
        String lastName = "Benish";
        String finalInfo = name + " " + lastName;

        System.out.println(finalInfo);

//
//        int number = 12 * 12 / 12+15;
//        int numberTwo = 12* 10 / 10+10;
//
//        int totalNumber = number +numberTwo;
//
//        System.out.println(totalNumber);
//
//        int myMinInt = Integer.MIN_VALUE;
//        int myMaxInt = Integer.MAX_VALUE;
//
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//
//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Float.MIN_VALUE);
//
//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);
//
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
//
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);
//
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE);
//
//        System.out.println("Integer Min: " + (myMinInt - 1)); // called underflow
//        System.out.println("Integer Max: " + (myMaxInt + 1)); //called overflow
//
//        int myMinByte = Byte.MIN_VALUE;
//        int myMaxByte = Byte.MAX_VALUE;

//        System.out.println(Byte.MIN_VALUE);
//        byte minNumber = -128;
//        byte myNewByte = (byte) (minNumber/2);
//     ///***************************************************************
//       int myIntValue = 10 - 8;   //5 * 2;    // 5 / 2;
//       float myFloatValue =15f -7f; //5f * 2f; // 5f / 2f;
//       double myDoubleValue = 25 - 13d; // 5 * 2d; // 5 / 2d;
//
//        System.out.println("my int val: " + myIntValue);
//        System.out.println("my float val: " + myFloatValue);
//        System.out.println("my double value: "+ myDoubleValue);

        ///****************************************************************

        double kgRatio = 0.45359237d;
        double kg = 11.2d;
        double pound = kg/kgRatio;

     //   System.out.println(pound);
        System.out.println("Result: " + pound + " pound!");

        //*******************************************************************

        char character = 'd';

        System.out.println("my character is: " + character + " and f!");

        //********************************************************************

        //Boolean

        boolean myBooValOne = true;
        boolean myBooValTwo = false;

        //*******************************************************************

        //String

        String myFirstName = "Nabiullah";
        String myLastName = "Benish";
        String myNationality ="Afghan";
        String myAge = "Forty";
        String altogether = myFirstName + " " + myLastName + " "+ myNationality + " " +  myAge;

        System.out.println(myFirstName);
        System.out.println(myLastName);
        System.out.println(myNationality);
        System.out.println(myAge);
        System.out.println(altogether + " years old!");

        //************************************************************************\\

        int number = 4 + 5;
        int numberOne = 5 -3;
        int numberTwo = 14 * 3;
        int numberThree = (int) 15/4;
        int numberFour = 7 % 2;

        System.out.println( number);
        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);
        System.out.println(numberFour);

//        int result = 4 + 5;
//        System.out.println(" 4 + 5 = " + result);
//
//        result = 8 - 7;
//        System.out.println(" 8 - 7 = " + result);
//
//        result = 9 * 3;
//        System.out.println(" 9 * 3 = " + result);
//
//        result = 15/4;
//
//        System.out.println("15 / 4 = " + result);
//
//        result = 15 % 2;
//
//        System.out.println("15 % 2 =" + result);

        int value = 5 * 12;
        int valueTwo = 6 * 13;
        int valueThree = 7 * 14;

        System.out.println(value);
        System.out.println(valueTwo);
        System.out.println(valueThree);

        short one = 12- 5;
        short two = 15 + 12;
        short three = 21 * 3;
        short four = 18 / 4;
        short five = 18 % 5;

        System.out.println( "12 - 5 = " + one );
        System.out.println(" 15 + 12 = " + two);
        System.out.println(" 21 * 3 = " + three );
        System.out.println(" 18 * 4 = " + four );
        System.out.println(" 18 % 5 = " + five);

      byte numbOne = + 1 ;

      numbOne ++;

        System.out.println( "numbOne ++ =" + numbOne);

        numbOne --;
        System.out.println("numbOne - - =" + numbOne);

        numbOne += 3;
        System.out.println(" numbOne += 3 => " + numbOne);

        numbOne -= 3;
        System.out.println(" numbOne -= 3 =>" + numbOne);

        numbOne *= 3;
        System.out.println("numbOne *=  3 =>" + numbOne);

        numbOne /= 3;
        System.out.println("numbOne /=3 => " +numbOne);
















    }
}
