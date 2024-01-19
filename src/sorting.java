import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer>numbers =new ArrayList<>();
        numbers.add(21);
        numbers.add(12);
        numbers.add(3);
        numbers.add(1);
        numbers.add(10);
        Collections.sort(numbers);
        System.out.println("Sorted Array"+numbers);
    }
}
