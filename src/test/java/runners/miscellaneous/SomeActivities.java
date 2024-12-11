package runners.miscellaneous;

public class SomeActivities {

    public static void main(String[] args) {

//        var/SomeActivities obj = new SomeActivities();
//        obj.printMessage();

        //*******************************First Phase!*****************************************
        //whenever we want to read a non-static methods, first we have to create an object from it then we can read it.
        // like above conmmented object.
        //    public void printMessage() {
//        System.out.println("Hello Afghanistan!");
//    }
/////////////////////////////////////////////////////////////
//        printMessage();
//
//        //another way to call static members of another class or maybe the same class as to call them through the
//        //name of the class and then the member, for example;

//        SomeActivities.printMessage();
////////////////////////////////
//        // Hello Name
//        // Hello Alex
//        // Hello Tony
//        // System.out.println("Hello " + name);
//        String name = "Alex";
//        System.out.println("Hello " + name);
//
//        String nameTwo = "Benish";
//        System.out.println("Hello Mr." + nameTwo);
//

        //******************************** Second Phase **************************************************

//         public static void printMessage() {
//             System.out.println("Hello Humans!");
//    }
        /////////////////////////////////////////////////////////////////////////

        //// to simplify this process, we need to create method!
        printMessage("Benish");
        printMessage("Alex");
        printMessage("Fadavi");
        printMessage("Mike");

        //these above methods called user defined methods!

        String message = "Hello World!";
        System.out.println(message.replaceAll(" ",""));
        //remove the distance between Hello and World
        System.out.println(removeSpaces(message));

        String fullName ="Tony Doe";
        System.out.println(removeSpaces(fullName));

        System.out.println(removeSpaces("Hello to all in the class!"));
        ///
        printStringWithRemoveSpaces("Hello Afghanistan!");
        /////////

        int numberOne= 5;
        int numberTwo= 10;
        int result = numberOne + numberTwo;
        System.out.println(result);
        //////////////
        sum(10,15);
        int resultTwo = sum(10,15);
        System.out.println(resultTwo);
        System.out.println(sum(160,105));
        ////
        printSum(120, 230);
        printSum(111, 112);

        charactersInString("I love java!");
        char [] characters = charactersInString (message);
        for (char character : characters) {
            System.out.println(character);
        }
     //   printArray(characters);

    }


    public void printMessage() {
        System.out.println("Hello Afghanistan!");
    }

    public static void printMessageOne() {
        System.out.println("Hello Humans!");
    }

    public static void printMessage(String name) {
        System.out.println("Hello " + name);
    }

    public static String removeSpaces(String str) {
        return str.replaceAll(" ","");
    }

    public static void printStringWithRemoveSpaces(String str){
        System.out.println(str.replaceAll(" ",""));
    }

    // 10 + 5 =15
    // Should return the result
    //Should print the result of the addition
    public static int sum (int a, int b) {
        return a + b;
    }

    public static void printSum (int a, int b) {
        System.out.println( sum(a, b));
    }

    //String str = "Hello Humans!";
    //Return an array of characters
    //Print each character of the String

    public static char [] charactersInString (String str) {
      //  return str.toCharArray();
        return removeSpaces(str).toCharArray();
    }

    public static void printArray(String[] arr) {
        for (String character : arr) {
            System.out.println(character);
        }
    }



}


//    public class MethodsPractice {
//
//        public static void main(String[] args) {
//
//            int result = sum(12, 12);
//            System.out.println(result);
//
//            stringToCharArrayPrint("Hello World");
//
//
//        }
//
//        public static int sum(int a, int b) {
//            return a + b;
//        }
//
//        public static char[] stringToCharArray(String input) {
//            return input.toCharArray();
//        }
//
//        public static void stringToCharArrayPrint(String input) {
//            char[] arr = input.toCharArray();
//            for (char character : arr) {
//                System.out.print("[ " + character + " ]");
//            }
//        }
//    }
//
////////
//
//
//package tests.browser;
//
//    public class MethodPractice {
//
//        public static void main(String[] args) {
//
//            sum(5, 15);
//            strToCharArray("Hello World");
//            strToChar("Hello World");
//
//
//        }
//
//        public static int sum(int num1, int num2) {
//
//            return num1 + num2;
//        }
//
//        public static char[] strToCharArray(String str) {
//
//            return str.toCharArray();
//        }
//
//        public static void strToChar(String str) {
//
//            char[] arr = str.toCharArray();
//            for (char character : arr) {
//                System.out.print("[ " + character + " ]");
//            }
//        }
//
//
//    }
//
//}
//
//////
//
//package tests.base;
//
//public class MethodExamples {
//    public static void main(String[] args) {
//        System.out.println(sum(5, 10));
//        sumOfNumbers(5, 10);
//        String str = "Hello Human!";
//        char[] charArray = convertStringToArray(str);
//        for (char Char : charArray) {
//            System.out.print(Char + " ");
//        }
//        printEachCharacter(str);
//    }
//
//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static void sumOfNumbers(int a, int b) {
//        System.out.println("the sum is " + a + b);
//    }
//
//    public static char[] convertStringToArray(String str) {
//        return str.toCharArray();
//    }
//
//    public static void printEachCharacter(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }
//    }
//}
