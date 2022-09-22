package Lab6.Task3;

import java.security.PublicKey;

public class DayLabor extends Worker{
    public DayLabor(int bw, int workingDays)
    {
        super(bw, workingDays);
    }
    @Override
    public double yearlyVacation() {
        return 0;
    }

    @Override
    public double yearlyWage() {
        return 12 + (workingDays*bw/25);
    }
}
