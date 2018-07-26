import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MyArrayList<T> extends ArrayList {
    @Override
    public T remove(int index) {
        throw new FunctionDisabled();
    }

    @Override
    public boolean remove(Object o) {
        throw new FunctionDisabled();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new FunctionDisabled();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new FunctionDisabled();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new FunctionDisabled();
    }

    @Override
    public boolean removeIf(Predicate filter) {
        throw new FunctionDisabled();
    }

    @Override
    public void replaceAll(UnaryOperator operator) {
        throw new FunctionDisabled();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new FunctionDisabled();
    }
}
