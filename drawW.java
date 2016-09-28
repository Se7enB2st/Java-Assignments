//San Jose State University Intro to Java Course Assignment: Draw W

// Write the code to draw a symmetrical letter W with 4 line segments.  
// Start the upper left hand corner at (0,0) 
// The total width will be 40 and the height will be 30.
// The drawing should look like this:
// http://i.imgur.com/kIwzrNn.png

public class WViewer {
    public static void main(String[] args) {
        new Line(0,0,10,30).draw();
        new Line(10,30,20,0).draw();
        new Line(20,0,30,30).draw();
        new Line(30,30,40,0).draw();    
    }
}
