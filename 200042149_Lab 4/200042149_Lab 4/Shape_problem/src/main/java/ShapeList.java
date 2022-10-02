import java.util.Random;

public class ShapeList{
    public String Shapes(Ishape[] objects)
    {
        String shapes = "";

        for(int i=0; i<objects.length; i++)
        {
            objects[i].printShape();
            shapes += "\n";
        }
        return shapes;
    }
}
