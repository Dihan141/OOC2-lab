package task1b;

public class EmailService {
    public String subject;
    public String body;
    public String from;
    public String to;
    public String cc;
    public boolean isImmediate;

    public void SendMail()
    {
        if(isImmediate) System.out.println("Sending immediately...");
        else System.out.println("Sending mail...");
    }

    //Feature envy code smell, separate mail class is not needed.
}
