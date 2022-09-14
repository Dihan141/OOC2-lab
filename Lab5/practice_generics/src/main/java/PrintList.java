import java.util.List;

public class PrintList<T> {
    String PrintList(List<? extends Person> personList){
        return personList.toString();
    }
}
