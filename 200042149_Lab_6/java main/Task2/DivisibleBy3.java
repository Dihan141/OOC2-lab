package Lab6.Task2;

public class DivisibleBy3 implements Iproperties<Integer>{
    @Override
    public boolean Check(Integer obj) {
        if(obj % 3 == 0) return true;
        return false;
    }
}
