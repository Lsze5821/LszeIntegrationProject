import java.util.Scanner;

// Louis Sze
// Description of project not quite decided, for now its some exercises.
public class Main {
    // this is a header
    // public is an access modifier
    //void is a return type, meaning this method does not return anything
    // method names should be in lowerCamelCase and be named with a verb
  public static void main(String[] args) {// special meaning, starting point of a program
    System.out.println("Welcome to my Integration Project");
    System.out.println("\tCheck out some of the excercise by toggling comments!");//escape sequence \t inserts a tab
    // Byte - is a 8 bit integer, with a minimum value and maximum value of 127
    // Short - is a 16 bit integer, with a minimum value of -32,768 and max 32,767
    // Int - is a 32 bit integer, with a minimum -2e-31 and a max of 2e-31-1
    // Long - is a 64 bit integer, with a minimum value of -2e-63 and a max of 2e64-1
    // Float - is a single precision 32 bit IEEE754
    // Double - is a 64 bit IEEE754
    // Char - a single 16 bit unicode character, with a minimum value of '\u0000'(0) and a max value
    // of '\uffff' (65,535)
    

    double radius = 5.0;
    double area;
    area = calculateArea(radius);
    System.out.println("The area is " + area);
  }

  
  public static double calculateArea(double rad) {
    return Math.PI * rad * rad;//returns

  
    Bicycle myBike = new Bicycle();//recomit
    myBike.setSpeed(5);
    System.out.println(myBike.getSpeed());
  }
}
    // this is a set method 
class Bicycle {
    private int speed;
    private int cadence;
    
    public int getSpeed() {
        return speed;
    }
    //this is a get method
    public void setSpeed(int s) {
        speed = s;
    }

    
//    double num1 = 5;
//        //this is a call in parenthesis is an argument 
//    SquareIt(num1);
//    public static double squareIt(double n1) {
//      return n1*n1
//    }
    
//    Car myCar = new Car();
//    Car kit = new Car();
//    Car mysteryMachine = new Car();
    
//    myCar.setColor("black");
//    System.out.println(myCar.getColor());

//      int myInt;// declaring a int
//    long myLong = 99L;// declaring a long variable
//    myInt = (int) myLong;// declaring casting int to a long
//    System.out.println(myInt);// print out a long as a int

//     System.out.println("Enter number for sorting");
//     Scanner sc = new Scanner(System.in);
//     int t = sc.nextInt();
//    
//     for (int i = 0; i < t; i++) {
//    
//     try {
//     long x = sc.nextLong();
//     System.out.println(x + " can be fitted in:");// If else statement
//     if (x >= -128 && x <= 127)
//     System.out.println("* byte");// if the integer is within the parameter byte gets printed
//     if (x >= -32768 && x <= 32767)
//     System.out.println("* short");// if the integer is between these parameter a short is
//     // printed
//     if (x >= -2147483648 && x <= 2147483647)
//     System.out.println("* int");// if the integer is between these parameter a short is
//     // printed.
//     if (x >= -9223372036854775808L && x <= 9223372036854775807L)
//     System.out.println("* long");// Complete the code
//     } catch (Exception e) {
//     System.out.println(sc.next() + " can't be fitted anywhere.");
//     }
//     }

//     //java string introduction, substrings.
//     Scanner sc=new Scanner(System.in);//scanner get input from user
//     String A=sc.next();
//     String B=sc.next();
//     /* Enter your code here. Print output to STDOUT. */
//    
//     System.out.println(A.length()+B.length());
//     int i = A.compareTo(B);
//     if(i>0){//if statement if i is greater than zero print yes
//     System.out.println("Yes");
//     } else{// else statement if its not true prints out no
//     System.out.println("No");
//     }
//     String a = A.substring(0,1).toUpperCase()+A.substring(1);
//     String b = B.substring(0,1).toUpperCase()+B.substring(1);;
//     System.out.println(a+" "+b);

//     Scanner scan = new Scanner(System.in);
//     System.out.println("Enter Integer");
//     int a = scan.nextInt();
//     System.out.println("Enter a Double:");
//     double b = scan.nextDouble();
//     scan.nextLine();// when going from numbers to string, clear out buffer.
//     System.out.println("Enter a String:");
//     String c = scan.nextLine();
//     System.out.println(a);// prints out int a, a integer
//     System.out.println(b);// prints out double b, a integer on two side of a (.)
//     System.out.println(c);// prints out a string c, prints out a string of characters.

//    Scanner scan = new Scanner(System.in);// Gets input from user.
//
//    // Outside of HackerRank, this program would need a prompt so the user
//    // would know what to do, like this...
//    System.out.println("Enter a greeting: ");// prints out instructions.
//
//    // Read a full line of input and save it to our variable, greeting.
//    String greeting = scan.nextLine();// obtains input
//    //
//    // Close the scanner object, because we've finished reading
//    // all of the input needed for this challenge.
//    scan.close();// closes the scan
//
//    // Complete this line of code to output the value in the variable greeting
//    System.out.println(greeting);// prints out the input

    // variable or an object or an integer being declared.
    // scope is a variable accessible in area its declared.
    // final variable is a variable that can't be changed
    // Casting is going from one data type to another
    // ctrl shift f- automatic format

//     int int1 =2;// integer storing a int variable
//     double double1 = 2.0; //double is integer on the left and the right of the decimal
//     String string1 = "2"; // storing a variable or an object as a string.
//    
//     /* Declare and initialize second integer, double, and String variables. */
//     int int2 =2;
//     double double2 = 2.0;//assigning a variable to a double
//     String string2 = "2";//assigning a variable to a string
//     /* Print the sum of both integer variables on a new line. */
//     System.out.println(int1+int2);
//     /* Print the sum of the double variables on a new line. */
//     System.out.println(double1+double2);
//     /* Concatenate and print the string variable son a new line. */
//     System.out.println(string1+string2);
    

  }
  // }
  // class Clock{
  // fields
  // private int angleOfHourHand;
  // private int angleOfMinuteHand;

    private static void SquareIt(double num1) {
      // TODO Auto-generated method stub
      
    }

  // methods
  // public void tellTime() {

}
// }

// Going to number from string clear out the buffer
