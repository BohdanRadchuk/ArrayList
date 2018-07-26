import java.util.ArrayList;
import java.util.List;

public class ArrayNumbersCounter {

    public ArrayList repeatsCount(List<Integer> list) {

        ArrayList<NumberCounter> countedList = new ArrayList<>();
        for (Integer income : list) {
            int index = getIndexOfNumberIfExist(income, countedList);
            if (index != (-1)) {
                countedList.get(index).setCounter(countedList.get(index).getCounter() + 1);
            } else {
                countedList.add(new NumberCounter(income, 1));
            }
        }
        return countedList;
    }

    private int getIndexOfNumberIfExist(int income, ArrayList<NumberCounter> numberCounters) {
        for (NumberCounter number : numberCounters) {
            if (number.getNumber() == income) {
                return numberCounters.indexOf(number);
            }
        }
        return (-1);
    }
}
