import java.util.Random;

public class ShapeList{
    public String Shapes(Ishape[] objects)
    {
        String shapes = "";

        for(int i=0; i<objects.length; i++)
        {
            objects[i].PrintShape();
            shapes += "\n";
        }
        return shapes;
    }
}
