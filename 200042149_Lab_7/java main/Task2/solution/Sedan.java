package Lab7.Task2.solution;

public class Sedan implements Ivehicle{
    private  int distanceKM;
    private  int timeMinutes;
    private  int numberOfPassengers;

    public Sedan(int distanceKM, int timeMinutes, int numberOfPassengers)
    {
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
    @Override
    public boolean canTakeTrip() {
        return numberOfPassengers <= 4 && distanceKM <= 25;
    }

    @Override
    public int perHeadFair() {
        return (50 + distanceKM * 30 + timeMinutes * 2) / numberOfPassengers;
    }
}
