import java.util.ArrayList;
import java.util.Collections;

public class Searching {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int possition = Collections.binarySearch(numbers,3);
        System.out.println("index  3  "+possition);

    }
}
