package Lab7.Task2.solution;

public class MotorBike implements Ivehicle{
    private  int distanceKM;
    private  int timeMinutes;
    private  int numberOfPassengers;

    public MotorBike(int distanceKM, int timeMinutes, int numberOfPassengers)
    {
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
    @Override
    public boolean canTakeTrip() {
        return numberOfPassengers <= 1 && distanceKM <= 10;
    }

    @Override
    public int perHeadFair() {
        return Math.max(25, distanceKM * 20) / numberOfPassengers;
    }
}
