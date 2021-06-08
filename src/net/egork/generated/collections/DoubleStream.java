package net.egork.generated.collections;

import net.egork.generated.collections.comparator.DoubleComparator;
import net.egork.generated.collections.function.*;
import net.egork.generated.collections.iterator.CharIterator;
import net.egork.generated.collections.iterator.DoubleIterator;
import net.egork.generated.collections.iterator.IntIterator;
import net.egork.generated.collections.iterator.LongIterator;
import net.egork.generated.collections.list.DoubleArrayList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public interface DoubleStream extends Iterable<Double>, Comparable<DoubleStream> {
    //abstract
    DoubleIterator doubleIterator();

    //base
    default Iterator<Double> iterator() {
        return new Iterator<Double>() {
            private final DoubleIterator it = doubleIterator();

            public boolean hasNext() {
                return it.isValid();
            }

            public Double next() {
                double result = it.value();
                it.advance();
                return result;
            }
        };
    }

    default double first() {
        return doubleIterator().value();
    }

    default DoubleCollection compute() {
        return new DoubleArrayList(this);
    }

    default int compareTo(DoubleStream c) {
        DoubleIterator it = doubleIterator();
        DoubleIterator jt = c.doubleIterator();
        while (it.isValid() && jt.isValid()) {
            double i = it.value();
            double j = jt.value();
            if (i < j) {
                return -1;
            } else if (i > j) {
                return 1;
            }
            it.advance();
            jt.advance();
        }
        if (it.isValid()) {
            return 1;
        }
        if (jt.isValid()) {
            return -1;
        }
        return 0;
    }

    //algorithms
    default void forEach(DoubleTask task) {
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            task.process(it.value());
        }
    }

    default boolean contains(double value) {
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            if (it.value() == value) {
                return true;
            }
        }
        return false;
    }

    default boolean contains(DoubleFilter filter) {
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            if (filter.accept(it.value())) {
                return true;
            }
        }
        return false;
    }

    default int count(double value) {
        int result = 0;
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            if (it.value() == value) {
                result++;
            }
        }
        return result;
    }

    default int count(DoubleFilter filter) {
        int result = 0;
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            if (filter.accept(it.value())) {
                result++;
            }
        }
        return result;
    }

    default double min() {
        double result = Double.POSITIVE_INFINITY;
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            double current = it.value();
            if (current < result) {
                result = current;
            }
        }
        return result;
    }

    default double min(DoubleComparator comparator) {
        double result = Double.MIN_NORMAL;
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            double current = it.value();
            if (result == Double.MIN_NORMAL || comparator.compare(result, current) > 0) {
                result = current;
            }
        }
        return result;
    }

    default double max() {
        double result = Double.NEGATIVE_INFINITY;
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            double current = it.value();
            if (current > result) {
                result = current;
            }
        }
        return result;
    }

    default double max(DoubleComparator comparator) {
        double result = Double.MIN_NORMAL;
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            double current = it.value();
            if (result == Double.MIN_NORMAL || comparator.compare(result, current) < 0) {
                result = current;
            }
        }
        return result;
    }

    default double sum() {
        double result = 0;
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            result += it.value();
        }
        return result;
    }

    default int[] qty(int bound) {
        int[] result = new int[bound];
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            result[(int) it.value()]++;
        }
        return result;
    }

    default int[] qty() {
        return qty((int) (max() + 1));
    }

    default boolean allOf(DoubleFilter f) {
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            if (!f.accept(it.value())) {
                return false;
            }
        }
        return true;
    }

    default boolean anyOf(DoubleFilter f) {
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            if (f.accept(it.value())) {
                return true;
            }
        }
        return false;
    }

    default boolean noneOf(DoubleFilter f) {
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            if (f.accept(it.value())) {
                return false;
            }
        }
        return true;
    }

    default double reduce(DoubleDoubleToDoubleFunction f) {
        DoubleIterator it = doubleIterator();
        if (!it.isValid()) {
            return Double.MIN_NORMAL;
        }
        double result = it.value();
        while (it.advance()) {
            result = f.value(result, it.value());
        }
        return result;
    }

    default double reduce(double initial, DoubleDoubleToDoubleFunction f) {
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            initial = f.value(initial, it.value());
        }
        return initial;
    }

    default int reduce(int initial, IntDoubleToIntFunction f) {
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            initial = f.value(initial, it.value());
        }
        return initial;
    }

    default long reduce(long initial, LongDoubleToLongFunction f) {
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            initial = f.value(initial, it.value());
        }
        return initial;
    }

    default char reduce(char initial, CharDoubleToCharFunction f) {
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            initial = f.value(initial, it.value());
        }
        return initial;
    }

    //views
    default DoubleStream union(DoubleStream other) {
        return () -> new DoubleIterator() {
            private final DoubleIterator first = DoubleStream.this.doubleIterator();
            private DoubleIterator second;

            public double value() throws NoSuchElementException {
                if (first.isValid()) {
                    return first.value();
                }
                return second.value();
            }

            public boolean advance() throws NoSuchElementException {
                if (first.isValid()) {
                    first.advance();
                    if (!first.isValid()) {
                        second = other.doubleIterator();
                    }
                    return second.isValid();
                } else {
                    return second.advance();
                }
            }

            public boolean isValid() {
                return first.isValid() || second.isValid();
            }

            public void remove() {
                if (first.isValid()) {
                    first.remove();
                } else {
                    second.remove();
                }
            }
        };
    }

    default DoubleStream filter(DoubleFilter f) {
        return () -> new DoubleIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();

            {
                next();
            }

            private void next() {
                while (it.isValid() && !f.accept(it.value())) {
                    it.advance();
                }
            }

            public double value() {
                return it.value();
            }

            public boolean advance() {
                it.advance();
                next();
                return isValid();
            }

            public boolean isValid() {
                return it.isValid();
            }

            public void remove() {
                it.remove();
            }
        };
    }

    default DoubleStream map(DoubleToDoubleFunction function) {
        return () -> new DoubleIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();

            public double value() {
                return function.value(it.value());
            }

            public boolean advance() {
                return it.advance();
            }

            public boolean isValid() {
                return it.isValid();
            }

            public void remove() {
                it.remove();
            }
        };
    }

    default IntStream map(DoubleToIntFunction function) {
        return () -> new IntIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();

            public int value() {
                return function.value(it.value());
            }

            public boolean advance() {
                return it.advance();
            }

            public boolean isValid() {
                return it.isValid();
            }

            public void remove() {
                it.remove();
            }
        };
    }

    default LongStream map(DoubleToLongFunction function) {
        return () -> new LongIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();

            public long value() {
                return function.value(it.value());
            }

            public boolean advance() {
                return it.advance();
            }

            public boolean isValid() {
                return it.isValid();
            }

            public void remove() {
                it.remove();
            }
        };
    }

    default CharStream map(DoubleToCharFunction function) {
        return () -> new CharIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();

            public char value() {
                return function.value(it.value());
            }

            public boolean advance() {
                return it.advance();
            }

            public boolean isValid() {
                return it.isValid();
            }

            public void remove() {
                it.remove();
            }
        };
    }

    default DoubleStream join(DoubleStream other, DoubleDoubleToDoubleFunction f) {
        return () -> new DoubleIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final DoubleIterator jt = other.doubleIterator();

            public double value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default IntStream join(DoubleStream other, DoubleDoubleToIntFunction f) {
        return () -> new IntIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final DoubleIterator jt = other.doubleIterator();

            public int value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default LongStream join(DoubleStream other, DoubleDoubleToLongFunction f) {
        return () -> new LongIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final DoubleIterator jt = other.doubleIterator();

            public long value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default CharStream join(DoubleStream other, DoubleDoubleToCharFunction f) {
        return () -> new CharIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final DoubleIterator jt = other.doubleIterator();

            public char value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default DoubleStream join(IntStream other, DoubleIntToDoubleFunction f) {
        return () -> new DoubleIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final IntIterator jt = other.intIterator();

            public double value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default IntStream join(IntStream other, DoubleIntToIntFunction f) {
        return () -> new IntIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final IntIterator jt = other.intIterator();

            public int value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default LongStream join(IntStream other, DoubleIntToLongFunction f) {
        return () -> new LongIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final IntIterator jt = other.intIterator();

            public long value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default CharStream join(IntStream other, DoubleIntToCharFunction f) {
        return () -> new CharIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final IntIterator jt = other.intIterator();

            public char value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default DoubleStream join(LongStream other, DoubleLongToDoubleFunction f) {
        return () -> new DoubleIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final LongIterator jt = other.longIterator();

            public double value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default IntStream join(LongStream other, DoubleLongToIntFunction f) {
        return () -> new IntIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final LongIterator jt = other.longIterator();

            public int value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default LongStream join(LongStream other, DoubleLongToLongFunction f) {
        return () -> new LongIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final LongIterator jt = other.longIterator();

            public long value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default CharStream join(LongStream other, DoubleLongToCharFunction f) {
        return () -> new CharIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final LongIterator jt = other.longIterator();

            public char value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default DoubleStream join(CharStream other, DoubleCharToDoubleFunction f) {
        return () -> new DoubleIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final CharIterator jt = other.charIterator();

            public double value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default IntStream join(CharStream other, DoubleCharToIntFunction f) {
        return () -> new IntIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final CharIterator jt = other.charIterator();

            public int value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default LongStream join(CharStream other, DoubleCharToLongFunction f) {
        return () -> new LongIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final CharIterator jt = other.charIterator();

            public long value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }

    default CharStream join(CharStream other, DoubleCharToCharFunction f) {
        return () -> new CharIterator() {
            private final DoubleIterator it = DoubleStream.this.doubleIterator();
            private final CharIterator jt = other.charIterator();

            public char value() {
                return f.value(it.value(), jt.value());
            }

            public boolean advance() {
                return it.advance() && jt.advance();
            }

            public boolean isValid() {
                return it.isValid() && jt.isValid();
            }

            public void remove() {
                it.remove();
                jt.remove();
            }
        };
    }
}