import com.sun.source.tree.WhileLoopTree;

public class ShamelessGreen {
    public String Song()
    {
        String song = Verses(99, 0);
        return song;
    }

    public String Verses(int upperLimit, int lowerLimit)
    {
        String lines = "";

        if(upperLimit < 0 || lowerLimit < 0)
        {
            return "values can't be negative.";
        }
        if(upperLimit < lowerLimit)
        {
            return "upper limit must be higher.";
        }
        while (upperLimit >= lowerLimit)
        {
            lines += Verse(upperLimit);
            upperLimit--;
        }
        return lines;
    }

    public  String Verse(int number)
    {
        if(number < 0) return "verse number can't be negative.";
        switch (number)
        {
            case 0:
                return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
            case 1:
                return "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                        "Take it down and pass it around, no more bottles of beer on the wall.\n";
            case 2:
                return "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                        "Take one down and pass it around, 1 bottle of beer on the wall.\n";
            default:
                return  Integer.toString(number) + " bottles of beer on the wall, " + Integer.toString(number) + " bottles of beer.\n" +
                        "Take one down and pass it around, " + Integer.toString(number-1) + " bottles of beer on the wall.\n";
        }
    }
}
