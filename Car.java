package u2pp;

/**
 * This class represents a car‘s gas intake and consumption
 * 
 * @author Jacob Cho
 */

public class Car {
    private double gas; //The amount of gas in the tank
    private double mpg; //The fuel efficiency of the car in miles per gallon
    private String make; //The make of the car
    private String model; //The model of the car
    
    /**
     * A constructor method that creates a car with three attributes decided by the user, attributes listed below
     * 
     * @param anEfficiency - the efficiency of the Car
     * @param aMake - the make of the Car
     * @param aModel - the model of the Car
     */ 
    public Car(double anEfficiency, String aMake, String aModel) {
       	gas = 0;
        mpg = anEfficiency;
        make = aMake;
        model = aModel;
    }
    
    /**
     * A method that adds a user specified "amount" of gas into the car's gas tank
     * @param amount - the amount of gas to add to the tank
     */
    public void addGas (double amount) {
        gas += amount;
    }
    
    /**
     * A method that calculates the amount of gas a car has left after driving a specified distance using the amount of gas in the
     car's tank and the car's fuel efficiency
     * @param distance - the distance that the car has driven
     */
    public void drive (double distance) {
        gas -= distance/mpg;
    }
    
    /**
     * @return The amount of gas currently in the tank
     */
    public double getGasInTank() {
        return gas;
    }
    
    /**
     * @return The make and model of the car
     */
     public String getMakeAndModel() {
       return make + " " + model;
     }
    
    /**
     * @return The efficiency of the car. Used for testing purposes
     */
    public double getMpg() {
        return mpg;
    }
}