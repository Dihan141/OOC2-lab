package Lab7.TestTask2;
import Lab7.Task2.problem.Trip;
import Lab7.Task2.problem.VehicleType;
import org.junit.Test;

import static org.junit.Assert.*;

public class Testt2 {
    @Test
    public void TestSedanFair()
    {
        int expected = 365;
        Trip trip = new Trip(VehicleType.SEDAN, 45, 30,4);
        assertEquals(expected, trip.perHeadFare());
    }

    @Test
    public void TestSevenseaterFair()
    {
        int expected = 270;
        Trip trip = new Trip(VehicleType.SEVEN_SEATER, 45, 30, 5);
        assertEquals(expected, trip.perHeadFare());
    }

    @Test
    public void TestMotorBikeFair()
    {
        int expected = 450;
        Trip trip = new Trip(VehicleType.MOTOR_BIKE, 45, 30, 2);
        assertEquals(expected, trip.perHeadFare());
    }

    @Test
    public void TestSedanEligibility()
    {
        Trip trip = new Trip(VehicleType.SEDAN, 45, 30,4);
        boolean expected = trip.canTakeTrip();
        assertFalse(expected);
    }

    @Test
    public void TestSevenseaterEligibility()
    {
        Trip trip = new Trip(VehicleType.SEVEN_SEATER, 45, 30,4);
        boolean expected = trip.canTakeTrip();
        assertTrue(expected);
    }

    @Test
    public void TestMotorbikeEligibility()
    {
        Trip trip = new Trip(VehicleType.MOTOR_BIKE, 45, 30,2);
        boolean expected = trip.canTakeTrip();
        assertFalse(expected);
    }
}
