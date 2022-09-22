package Lab6.Task2;

public class countOdds implements Iproperties<Integer>{

    @Override
    public boolean Check(Integer obj) {
        if(obj%2 != 0) return true;
        return false;
    }
}
