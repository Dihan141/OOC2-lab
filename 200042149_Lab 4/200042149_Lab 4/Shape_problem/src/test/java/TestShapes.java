import org.junit.Test;

import static org.junit.Assert.*;

public class TestShapes {
    @Test
    public void TestCircle()
    {
        String expected = "Drawing Circle...";

        Circle circle = new Circle();
        assertEquals(expected, circle.PrintShape());
    }

    @Test
    public void TestSquare()
    {
        String expected = "Drawing Square...";

        Square square = new Square();
        assertEquals(expected, square.PrintShape());
    }

    @Test
    public  void TestRectangle()
    {
        String expected = "Drawing Rectangle...";

        Rectangle rectangle = new Rectangle();
        assertEquals(expected, rectangle.PrintShape());
    }

    @Test
    public void TestShapes()
    {
        String expected = "Drawing Circle...\n" +
                "Drawing Square...\n" +
                "Drawing Rectangle...\n";

        ShapeList shapeList = new ShapeList();
        Object[] objects= {new Circle(), new Square(), new Rectangle()};
        assertEquals(expected, shapeList.Shapes(objects));
    }
}
