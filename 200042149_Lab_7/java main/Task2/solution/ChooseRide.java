package Lab7.Task2.solution;

public class ChooseRide {
    public Ivehicle Ride(VehicleType type, int distance, int time, int numberOfPassengers)
    {
        Ivehicle vehicle;
        if(type.equals(VehicleType.Sedan))
            vehicle = new Sedan(distance, time, numberOfPassengers);
        else if(type.equals(VehicleType.SevenSeater))
            vehicle = new SevenSeater(distance, time, numberOfPassengers);
        else
            vehicle = new MotorBike(distance, time, numberOfPassengers);
        return vehicle;
    }
}
