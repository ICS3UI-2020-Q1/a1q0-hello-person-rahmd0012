import java.util.Scanner;

/**
 * Greets the user and calculates their approximate age 
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   // create a scanner for user import
   Scanner input = new Scanner(System.in);
   
    // Ask the user for their name
    System.out.println("Please enter your name:");

    // declare a variable to store the name of the user
    String name;

    // get input for user's name
    name = input.nextLine();

    // greet the user
    System.out.println("Hello " + name + "!");

    // declare and initialize the current year constant
    final int CURRENT_YEAR = 2020;

    // prompt the user to enter their birth year
    System.out.println("Please enter the year you were born:");

    // get the user's birth year
    int birthYear = input.nextInt();

    // calculate the approximate age
    int age = CURRENT_YEAR - birthYear;

    // tell the user their approximate age
    System.out.println("You are " + age + " years old."); 
    
  }
}
