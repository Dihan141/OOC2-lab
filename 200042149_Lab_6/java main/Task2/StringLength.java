package Lab6.Task2;

public class StringLength implements Iproperties<String>{
    @Override
    public boolean Check(String obj) {
        if(obj.length() > 4) return true;
        return false;
    }
}
