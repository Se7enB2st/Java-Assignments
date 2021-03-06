//San Jose State University Intro to Java Assignment: Inch Worm

// Write a class InchWorm that models an inch worm moving along a 
// horizontal line. The inch worm  moves either to the right or left.
// Initially, the inch worm moves to the right, but it can turn to
// change its direction. In each move, its position changes by one
// unit in the current direction. 

// Provide two constructors. 
// One that takes the initial position as an argument,
// and one with no arguments that sets the initial position to 0. 

// You will need two instance variables. 
// One to keep track of the position and one to keep track of the direction. 
// You can use 1 to represent moving right and -1 to represent moving left. 

public class InchWorm {
    // TODO: Add instance variables
    private int position;
    private int direction;

    public InchWorm() {
        // TODO: Complete constructor
        direction = 1;
        position = 0;
    }

    public InchWorm (int initialPosition) {
        // TODO: set the instance variable to the constructor parameter
        this.position = initialPosition;
        this.direction = 1;
    }

    public void move() {
        // TODO: Update the position of the inch worm
        this.position += this.direction;
    }

    public void turn() {
        // TODO: Update the direction
        // =- means put negative in front of number
        this.direction =-  this.direction;
    }

    public int getPosition() { return this.position; }

    public int getDirection() { return this.direction; }
}
