import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
        list.add(null);  // This works
        System.out.println(list);  // Output: [null]
    }
}
