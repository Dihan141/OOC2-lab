package Lab6.Task3;

public class Permanent extends Worker{
    public Permanent(int bw, int workingDays)
    {
        super(bw, workingDays);
    }
    @Override
    public double yearlyVacation() {
        return 20 + workingDays*0.03;
    }

    @Override
    public double yearlyWage() {
        return 12*(bw + bw*0.3 + bw*2);
    }
}
