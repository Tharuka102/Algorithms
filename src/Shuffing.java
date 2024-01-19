import java.util.ArrayList;
import java.util.Collections;

public class Shuffing {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(34);
        numbers.add(76);
        numbers.add(75);
        numbers.add(78);
        numbers.add(78);
        numbers.add(16);
        numbers.add(12);
        Collections.shuffle(numbers);
        System.out.println("Shuffled List"+numbers);

    }
}
