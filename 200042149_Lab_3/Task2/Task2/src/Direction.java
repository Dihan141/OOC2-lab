public enum Direction {
    North("I am in North", "I have to go South"),
    South("I am in south", "I have to go North"),
    East("I am in East", "I have to go west"),
    West("I am in West", "I have to go East");
    private  String s1, s2;
    Direction(String s1, String s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }

    public String getDir()
    {
        return s2;
    }
    public String getCurrDir(){ return  s1;}
}
