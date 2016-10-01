//San Jose State University Intro to Java Assignment: Flower

// Write a class that describes a flower. A flower has a location, a
// constructor and a draw method.
// The flower should look like the picture below:
// http://i.imgur.com/OC4EA29.png

// The constructor takes the (x, y) coordinate of the upper left-hand
// corner of the flower. The arrow points to the x,y coordinates of
// the flower.
 
// There are four pink petals and a yellow center. Each petal and the
// center is a circle with a diameter of 20. A circle is an ellipse in
// which the width and height are both equal to the diameter of the
// circle. The pink circles touch the yellow one.

// The stem is green and is on the center line of the flower. Its
// length is 3 times the diameter.

public class Flower {
    private int x;
    private int y;

    public Flower(int theX, int theY) 
    {
        this.x = theX;
        this.y = theY;
    }

    /**
    * This function draws the flower.
    */
    public void draw()
    {
        // Yellow Center Circle
        Ellipse circle1 = new Ellipse(x+20, y+20, 20,20);
        circle1.draw();
        circle1.setColor(Color.YELLOW);
        circle1.fill();

        // 1st pink petal lefthandside to the yellow circle
        Ellipse circle2 = new Ellipse(x, y+20, 20,20);
        circle2.draw();
        circle2.setColor(Color.PINK);
        circle2.fill();

        // 2nd pink petal righhandside to the yellow circle
        Ellipse circle3 = new Ellipse(x+40, y+20, 20,20);
        circle3.draw();
        circle3.setColor(Color.PINK);
        circle3.fill();
        
         // 3rd pink petal above yellow circle
        Ellipse circle4 = new Ellipse(x+20, y, 20,20);
        circle4.draw();
        circle4.setColor(Color.PINK);
        circle4.fill();

        // 4th pink petal under yellow circle
        Ellipse circle5 = new Ellipse(x+20, y+40, 20,20);
        circle5.draw();
        circle5.setColor(Color.PINK);
        circle5.fill();


        // Green stem under the 4th pink petal
        Line line1 = new Line(x+30,y+60,x+30,y+120);
        line1.draw();
        line1.setColor(Color.GREEN);
    }
}
