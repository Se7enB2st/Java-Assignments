//San Jose State University Intro to Java Courser Assignment: Friend Connection
// Bluej project: lesson3/friends4


public class Person
{
    // Instance variables
    private String name;
    private String friends;
    private int x;
    private int y;
    
    // Person constructor
    public Person (String aName, String pictureName, int xCoord, int yCoord)
    {
        name = aName;
        friends = "";
        Picture picture = new Picture(pictureName);
        picture.translate(xCoord, yCoord);
        picture.draw();
        x = xCoord;
        y = yCoord;
    }
    
    public void addFriend(Person friend) 
    {
        // Add friend's name onto friend list
        friends = friends + friend.name + " ";
        // Draw a circle on top of person
        SmallCircle circle = new SmallCircle(x, y);
        circle.fill();
        // connect the circle to friends
        Line friendLine = new Line(x, y, friend.x, friend.y);
        friendLine.draw();
    }
    
    public void unfriend(Person nonFriend)
    {
        // remove friend's name from list 
        friends = friends.replace(nonFriend.name + " ", "");
    }
    
    public String getFriends() 
    {
        // return list of friend's names
        return friends;
    }
}
