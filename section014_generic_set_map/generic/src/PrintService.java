import java.util.ArrayList;
import java.util.List;

//Usando um T generico
public class PrintService<T> {
    private List<T>  list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public T firts() {
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        System.out.print(list.get(0));

        for(int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.print("]");
    }
}
