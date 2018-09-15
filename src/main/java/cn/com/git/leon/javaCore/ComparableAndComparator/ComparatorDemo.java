package cn.com.git.leon.javaCore.ComparableAndComparator;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author sirius
 * @since 2018/9/14
 */
public class ComparatorDemo implements Comparator<Bean>{

    @Override
    public int compare(Bean o1, Bean o2) {
        return o1.getIntValue() - o2.getIntValue();
    }

    @Override
    public Comparator<Bean> reversed() {
        return null;
    }

    @Override
    public Comparator<Bean> thenComparing(Comparator<? super Bean> other) {
        return null;
    }

    @Override
    public <U> Comparator<Bean> thenComparing(Function<? super Bean, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Bean> thenComparing(Function<? super Bean, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Bean> thenComparingInt(ToIntFunction<? super Bean> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Bean> thenComparingLong(ToLongFunction<? super Bean> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Bean> thenComparingDouble(ToDoubleFunction<? super Bean> keyExtractor) {
        return null;
    }
}
