package Lab6.Task3;

public abstract class Worker {
    int bw;
    int workingDays;

    public Worker(int bw, int workingDays)
    {
        this.bw = bw;
        this.workingDays = workingDays;
    }

    public abstract double yearlyVacation();
    public abstract double yearlyWage();
}
