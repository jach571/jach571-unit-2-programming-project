package u2pp;

import java.util.Scanner; //Allows you to use the Scanner objects

/**
 * Prompts the user to input many different attributes of the car class. A scanner is used to get user input for various purposes
 such as the fuel efficiency, make, model, gas, and distance driven by the car.
 */

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a fuel efficiency: ");
    double fuelEfficiency = Double.parseDouble(scan.nextLine());

    System.out.print("Enter a make: ");
    String carMake = scan.nextLine();

    System.out.print("Enter a model: ");
    String carModel = scan.nextLine();

    Car car = new Car(fuelEfficiency, carMake, carModel);

    System.out.print("Enter amount of gas to add: ");
    double carGas = Double.parseDouble(scan.nextLine());
    car.addGas(carGas);

    System.out.print("Enter distance to drive: ");
    double carDistance = Double.parseDouble(scan.nextLine());
    car.drive(carDistance);

    System.out.print("Your " + car.getMakeAndModel() + " currently has " + car.getGasInTank() + " gallons of gas left in the tank");

    scan.close();
    }
  /**
   * Takes the pieces of two words and creates a new word by combining those pieces together. The variables start and end tell the 
   indices where to begin and end. The ending index of the string is inclusive.
   * @param word1 The first string to take a piece out of
   * @param start1 The starting index of the substring of word1
   * @param end1 The ending index of the substring of word1 (inclusive)
   * @param word2 The second string to take a piece out of
   * @param start2 The starting index of the substring of word2
   * @param end2 The ending index of the substring of word2 (inclusive)
   * @return combined The substringed versions of the two words combined without spaces
  */
  public static String wordChanger(String word1, int start1, int end1, String word2, int start2, int end2) {
    end1 += 1;
    end2 += 1;

    String combined = (word1.substring(start1, end1) + word2.substring(start2, end2));

    return combined;
  }
}