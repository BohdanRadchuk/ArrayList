import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(4, 5, (-6), 4, 5, 3, 4, 2, 4, 5, 7));
        ArrayNumbersCounter arrayNumbersCounter = new ArrayNumbersCounter();
        System.out.println(arrayNumbersCounter.repeatsCount(ints));
        MyArrayList<Integer> myInts = new MyArrayList<>();
        myInts.add(1);
        myInts.add(2);
        System.out.println(myInts);

        //all removals of element throws FunctionDisabled exception
        /*myInts.replaceAll(x -> null);                   //replaceAll to null
        myInts.subList(0, 1);                           //make sublist
        myInts.retainAll(myInts);                       //retain collection
        myInts.removeRange(0, 1);                       //remove in range
        Integer value = (Integer) myInts.get(0);
        myInts.removeIf(valueIsEqualOne(value));        //remove with predicate
        myInts.removeAll(myInts);                       //remove collection
        myInts.remove(myInts.get(0));                   //remove object
        myInts.remove(0);                         //remove by index
        myInts.removeAll(myInts);                       //remove all
        System.out.println(myInts);*/
    }

    public static Predicate<Integer> valueIsEqualOne(Integer value) {
        return p -> value == 1;
    }

}
