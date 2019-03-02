import java.util.Scanner;
//slowly working on this new theme i picked over spring break.
public class Introduction {
  public void Intro() {
    System.out.print("Welcome to my Integration Project\n");// \n creates a new line
    System.out.print("Welcome to a game of Black Jack!\n");
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter how many players:");
    int player = input.nextInt();
    System.out.println(player+" players entered.");
    
    
  }
  
}
