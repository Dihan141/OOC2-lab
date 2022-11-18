package assignment_2.Content_Coupling;

public class Circle {
    private int radius;
    public Point center;

    public Circle(int radius)
    {
        this.radius = radius;
    }

    public void SetCenter(int x, int y)
    {
        center.X = x;
        center.Y = y;
    }
}
