package assignment_2.Data_Coupling;

import assignment_2.Independence.Center;

public class Circle {
    private int radius;
    Center center;

    public Circle(int radius)
    {
        this.radius = radius;
    }

    public void SetCenter(int xCo0rd, int yCoord)
    {
        center = new Center(xCo0rd, yCoord);
    }
}
