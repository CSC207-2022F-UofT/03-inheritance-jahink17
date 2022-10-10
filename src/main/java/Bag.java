/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */
import java.util.*;
public abstract class Bag {
    private String color;
    private int numberOfContents;
    private int capacity;
    private Stack<String> contents;



    /*
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */

    /**
     * Constructor for Bag.
     * @param color: String specifying the color of the bag
     * @param capacity: int specifying the capacity of the bag
     */
    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new Stack<String>();
    }

    public String getColor() {
        return this.color;
    }

    public int getNumberOfContents() {
        return this.numberOfContents;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }





    /*
     *       This method should return true if the item was added
     *       and false otherwise.
     */
    public boolean addItem(String item) {
        if (this.numberOfContents >= this.capacity) { return false; }
        else {
            this.contents.add(item);
            this.numberOfContents ++;
            return true;
        }
    }





    /**
     * TODO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     * If there are no items in this Bag, return null.
     *
     * @return String representing the last object added to the bag. If there were none, return null.
     */
    public String popItem() {
        if (this.numberOfContents == 0) { return null; }
        this.numberOfContents -= 1;
        return this.contents.pop();
    }





    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        // TODO: Implement this method.
        this.capacity += n;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return Return the details of the bag as a String
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}