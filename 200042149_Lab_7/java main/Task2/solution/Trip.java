package Lab7.Task2.solution;

public class Trip {
    private Ivehicle type;
    public Trip(VehicleType vehicleType,
                int distanceKM,
                int timeMinutes,
                int numberOfPassengers) {

        this.type = new ChooseRide().Ride(vehicleType, distanceKM, timeMinutes, numberOfPassengers);
    }

    public int perHeadFare()
    {
        return type.perHeadFair();
    }

    public boolean canTakeTrip()
    {
        return  type.canTakeTrip();
    }
}
