package Lab6.Task3;

public class MonthlyContract extends Worker{
    public MonthlyContract(int bw)
    {
        super(bw, 12);
    }
    @Override
    public double yearlyWage() {
        return bw * workingDays;
    }

    @Override
    public double yearlyVacation() {
        return 21;
    }
}
