package 三轮.B_JavaCore.h_comparable和comparator;

import 三轮.Bean3;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author sirius
 * @since 2019/3/12
 */
public class ComparatorDemo implements Comparator<Bean3>{
    @Override
    public int compare(Bean3 o1, Bean3 o2) {
        return o1.getName().length()-o2.getName().length();
    }

    @Override
    public Comparator<Bean3> reversed() {
        return null;
    }

    @Override
    public Comparator<Bean3> thenComparing(Comparator<? super Bean3> other) {
        return null;
    }

    @Override
    public <U> Comparator<Bean3> thenComparing(Function<? super Bean3, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Bean3> thenComparing(Function<? super Bean3, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Bean3> thenComparingInt(ToIntFunction<? super Bean3> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Bean3> thenComparingLong(ToLongFunction<? super Bean3> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Bean3> thenComparingDouble(ToDoubleFunction<? super Bean3> keyExtractor) {
        return null;
    }
}
