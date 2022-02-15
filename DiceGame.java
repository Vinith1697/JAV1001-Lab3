//Name: Vinith Nair
//Student id: A00241282
//Description: The main class where in the object of the constructor is create and the dices are rolled to test the roll method

//importing util packages
import java.util.*;
import java.util.Random;

public class DiceGame{
  public static void main(String[] args){
    int min = 1;

    System.out.println("Creating a default d6...");
    System.out.println("Creating a d20");
    System.out.println("Creating a percentile die (a special d10)");
    System.out.println("The current side up for d6 is " + ((int) ((Math.random() * (6 - min)) + min)));
    System.out.println("The current side up for d20 is " + ((int) ((Math.random() * (20 - min)) + min)));
    System.out.println("The current side up for Percentile is " + ((int) ((Math.random() * (10 - min)) + min)));

    //creating the objects
    Die die = new Die();

    Die die2 = new Die(20);

    Die die3 = new Die("Percentile",10);

    System.out.println("---- ");
    System.out.println("Testing the roll method");
    System.out.println("---- ");

    //calling the roll method
    die.roll();
    die2.roll();
    die3.roll();

  }
}
