package Lab7.Task2.solution;

public class SevenSeater implements Ivehicle{
    private  int distanceKM;
    private  int timeMinutes;
    private  int numberOfPassengers;

    public SevenSeater(int distanceKM, int timeMinutes, int numberOfPassengers)
    {
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public boolean canTakeTrip() {
        return numberOfPassengers <= 7 && distanceKM >= 10;
    }

    @Override
    public int perHeadFair() {
        int fare = 0;
        if (distanceKM < 10)
            fare = 300 / numberOfPassengers;
        else
            fare = distanceKM * 30 / numberOfPassengers;

        return fare;
    }
}
