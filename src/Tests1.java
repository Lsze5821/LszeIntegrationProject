import java.util.Scanner;
import java.util.Random;

public class Tests1 {
  public static void main(String args[]) {
    String greet1 = "Hello";
    String greet2 = "World";
    String message2 = greet1 + " " + greet2;
    System.out.println(message2);
  }

  private static final Scanner scanner = new Scanner(System.in);

  public void Test1() {
    System.out.println("Temp psi2");

    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    if (20 < N && N % 2 == 0) { // parameters in the parenthesis or condition of a for loop
      System.out.println("Not Weird");
    } else if (2 <= N && N <= 5 && N % 2 == 0) {// if else construct
      System.out.println("Not Weird");
    } else if (6 <= N && N <= 20 && N % 2 == 0) {//even statement using divisible by 2 is equal to 0
      System.out.println("Weird");
    } else if (N % 2 == 1) {//odd statement using divisible by 2 equal to 1
      System.out.println("Weird");
    }


    Scanner scan = new Scanner(System.in);
    System.out.println("Tell me the size of your slice and I will tell");
    System.out.println("you which is larger, the number entered, or PI");
    double slice = scan.nextDouble();
    System.out.println(Math.max(3.141592653589793, slice));// output the larger value, slice or PI
                                                           // using math class.
    scanner.close();
    
   
      // create random object, only do this once
      Random randomGen = new Random();
        int number;
      
      for(int counter =1; counter<=6; counter++){
        number = 1+randomGen.nextInt(53);
        System.out.println(number);
      }
  }



}


