import java.util.Random;

public class Card {
  private String suit;
  private int number;
  
  public String getSuit() {
    return suit;
  }
  public void setSuit(String suiteToBeSet) {
    suit = suiteToBeSet;
  }
  public void draw() {
    Random randomGen = new Random();
    int suitNum = randomGen.nextInt();
    if (suitNum == 0) {
    suit = "Diamonds"; //could be random
    }else if (suitNum == 1) {
      suit ="clubs";//could be random
    }else if (suitNum == 2) {
      suit = "Spades";//could be random
    }else if (suitNum == 3) {
      suit = "Hearts";//could be random
    }else {
      System.out.println("Uh Oh");
      
    }
    number = Math.abs(randomGen.nextInt()%13);//could be random
  
    
 
  }
}
