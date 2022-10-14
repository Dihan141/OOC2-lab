package Lab7.TestTask2;

import Lab7.Task2.solution.*;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class TestRefactored {
    @Test
    public void TestSedanFair()
    {
        int expected = 365;
        Trip trip = new Trip(VehicleType.Sedan, 45, 30,4);
        assertEquals(expected, trip.perHeadFare());
    }

    @Test
    public void TestSevenseaterFair()
    {
        int expected = 270;
        Trip trip = new Trip(VehicleType.SevenSeater, 45, 30, 5);
        assertEquals(expected, trip.perHeadFare());
    }

    @Test
    public void TestMotorBikeFair()
    {
        int expected = 450;
        Trip trip = new Trip(VehicleType.MotorBike, 45, 30, 2);
        assertEquals(expected, trip.perHeadFare());
    }

    @Test
    public void TestSedanEligibility()
    {
        Trip trip = new Trip(VehicleType.Sedan, 45, 30,4);
        boolean expected = trip.canTakeTrip();
        assertFalse(expected);
    }

    @Test
    public void TestSevenseaterEligibility()
    {
        Trip trip = new Trip(VehicleType.SevenSeater, 45, 30,4);
        boolean expected = trip.canTakeTrip();
        assertTrue(expected);
    }

    @Test
    public void TestMotorbikeEligibility()
    {
        Trip trip = new Trip(VehicleType.MotorBike, 45, 30,2);
        boolean expected = trip.canTakeTrip();
        assertFalse(expected);
    }
}
