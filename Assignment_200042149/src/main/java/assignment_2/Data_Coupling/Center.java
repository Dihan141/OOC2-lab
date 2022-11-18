package assignment_2.Data_Coupling;

public class Center {
    private int X;
    private int Y;

    public Center(int xCoordinate, int yCoordinate)
    {
        this.X = xCoordinate;
        this.Y = yCoordinate;
    }

    public int getxCoordinate()
    {
        return X;
    }

    public int getYCoordinate()
    {
        return Y;
    }
}
