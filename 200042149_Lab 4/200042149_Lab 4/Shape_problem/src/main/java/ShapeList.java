import java.util.Random;

public class ShapeList{
    public String Shapes(Object[] objects)
    {
        String shapes = "";

        for(int i=0; i<objects.length; i++)
        {
            if(objects[i] instanceof Circle)
                shapes += new Circle().PrintShape();
            if(objects[i] instanceof Square)
                shapes += new Square().PrintShape();
            if(objects[i] instanceof Rectangle)         //have to create instance everytime we add new object
                shapes += new Rectangle().PrintShape(); //have to add new condition everytime we add new object
            shapes += "\n";
        }
        return shapes;
    }
}
