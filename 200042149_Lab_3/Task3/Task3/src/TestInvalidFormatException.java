public class TestInvalidFormatException {
    public static void Validate(String s) throws InvalidFormatException {
        int flg = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '_')
            {
                flg = 1;
            }
        }

        if(flg == 0 || s.length() != 8)
        {
            throw new InvalidFormatException("The number is invalid!");
        }
        else
        {
            System.out.println("The number is okay.");
        }
    }
}
