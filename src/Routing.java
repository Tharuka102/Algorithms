import java.util.ArrayList;
import java.util.Collections;

public class Routing {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Collections.reverse(numbers);
        System.out.println("Reversed Array"+numbers);

        Collections.swap(numbers,0,2);
        System.out.println("Swaped Array"+numbers);

        ArrayList<Integer>newNumbers=new ArrayList<>();

        newNumbers.addAll(numbers);
        System.out.println("After add Array"+newNumbers);

    }
}
