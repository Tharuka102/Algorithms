import java.util.ArrayList;
import java.util.Collections;

public class Compostion {
    public static void main(String[] args) {


        ArrayList<Integer>number=new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(2);
        int count = Collections.frequency(number,2);
        System.out.println("");


        ArrayList<Integer>newNumber=new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        boolean answer =Collections.disjoint(newNumber,number);
        System.out.println("");



    }
}
