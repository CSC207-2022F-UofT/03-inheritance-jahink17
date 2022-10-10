/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

/*       The constructor for CrossbodyBag should take the following parameters
 *       in order:
 *           1. a String for the color
 *           2. an int for the capacity
 *           3. an int for the number of straps
 *
 *       CrossbodyBag should also have a getter method called getNumberOfStraps
 *       and it should implement the enhance method.
 *
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */
/** A subclass of Bag. Has an additional attribute -- numberOfStraps denoting the
 * number of straps in the bag.
 */
public class CrossbodyBag extends Bag {
    private final int numberOfStraps;

    /**
     * Constructor for CrossbodyBag. Same as the constructor for Bag, but also
     * initializes the additional attribute numberOfStraps.
     * @param color: string specifying color of the bag
     * @param capacity: int specifying capacity of the bag
     * @param numberOfStraps: int specifying the number of straps
     */
    public CrossbodyBag(String color, int capacity, int numberOfStraps) {
        super(color, capacity);
        this.numberOfStraps = numberOfStraps;
    }

    /**
     * Getter method for retrieving the number of straps.
     * @return the number of straps
     */
    public int getNumberOfStraps() {
        return this.numberOfStraps;
    }

    /**
     * Increase capacity by 2.
     */
    public void enhance() {
        this.increaseCapacity(2);
    }

    /**
     * Obtain a string representation of the CrossbodyBag.
     * @return string representation of the bag's details
     */
    public String toString() {
        String bagString = super.toString();
        String newString = String.format("Crossbody Bag with %s straps", this.numberOfStraps);
        return bagString.replace("Bag", newString);
    }
}
