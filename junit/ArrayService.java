package junit;

import java.util.LinkedList;
import java.util.List;

public class ArrayService {

    public int[] numbers (int a, int b, int c, int d) {
        return new int[]{a,b,c,d};
    }

    public List<Integer> data(int a, int b) {
        List<Integer> data = new LinkedList<>();
        data.add(a);
        data.add(b);
        return data;
    }

    public void save(String name) {
        if (name == null) {
            throw new NullPointerException();
        }
    }
}
