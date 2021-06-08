package net.egork.generated.collections;

import net.egork.generated.collections.comparator.LongComparator;
import net.egork.generated.collections.function.*;
import net.egork.generated.collections.iterator.CharIterator;
import net.egork.generated.collections.iterator.DoubleIterator;
import net.egork.generated.collections.iterator.IntIterator;
import net.egork.generated.collections.iterator.LongIterator;
import net.egork.generated.collections.list.LongArrayList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public interface LongStream extends Iterable<Long>, Comparable<LongStream> {
    //abstract
    LongIterator longIterator();

    //base
    default Iterator<Long> iterator() {
        return new Iterator<Long>() {
            private final LongIterator it = longIterator();

            public boolean hasNext() {
                return it.isValid();
            }

            public Long next() {
                long result = it.value();
                it.advance();
                return result;
            }
        };
    }

    default long first() {
        return longIterator().value();
    }

    default LongCollection compute() {
        return new LongArrayList(this);
    }

    default int compareTo(LongStream c) {
        LongIterator it = longIterator();
        LongIterator jt = c.longIterator();
        while (it.isValid() && jt.isValid()) {
            long i = it.value();
            long j = jt.value();
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
    default void forEach(LongTask task) {
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            task.process(it.value());
        }
    }

    default boolean contains(long value) {
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            if (it.value() == value) {
                return true;
            }
        }
        return false;
    }

    default boolean contains(LongFilter filter) {
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            if (filter.accept(it.value())) {
                return true;
            }
        }
        return false;
    }

    default int count(long value) {
        int result = 0;
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            if (it.value() == value) {
                result++;
            }
        }
        return result;
    }

    default int count(LongFilter filter) {
        int result = 0;
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            if (filter.accept(it.value())) {
                result++;
            }
        }
        return result;
    }

    default long min() {
        long result = Long.MAX_VALUE;
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            long current = it.value();
            if (current < result) {
                result = current;
            }
        }
        return result;
    }

    default long min(LongComparator comparator) {
        long result = Long.MIN_VALUE;
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            long current = it.value();
            if (result == Long.MIN_VALUE || comparator.compare(result, current) > 0) {
                result = current;
            }
        }
        return result;
    }

    default long max() {
        long result = Long.MIN_VALUE;
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            long current = it.value();
            if (current > result) {
                result = current;
            }
        }
        return result;
    }

    default long max(LongComparator comparator) {
        long result = Long.MIN_VALUE;
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            long current = it.value();
            if (result == Long.MIN_VALUE || comparator.compare(result, current) < 0) {
                result = current;
            }
        }
        return result;
    }

    default long sum() {
        long result = 0;
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            result += it.value();
        }
        return result;
    }

    default int[] qty(int bound) {
        int[] result = new int[bound];
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            result[(int) it.value()]++;
        }
        return result;
    }

    default int[] qty() {
        return qty((int) (max() + 1));
    }

    default boolean allOf(LongFilter f) {
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            if (!f.accept(it.value())) {
                return false;
            }
        }
        return true;
    }

    default boolean anyOf(LongFilter f) {
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            if (f.accept(it.value())) {
                return true;
            }
        }
        return false;
    }

    default boolean noneOf(LongFilter f) {
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            if (f.accept(it.value())) {
                return false;
            }
        }
        return true;
    }

    default long reduce(LongLongToLongFunction f) {
        LongIterator it = longIterator();
        if (!it.isValid()) {
            return Long.MIN_VALUE;
        }
        long result = it.value();
        while (it.advance()) {
            result = f.value(result, it.value());
        }
        return result;
    }

    default double reduce(double initial, DoubleLongToDoubleFunction f) {
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            initial = f.value(initial, it.value());
        }
        return initial;
    }

    default int reduce(int initial, IntLongToIntFunction f) {
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            initial = f.value(initial, it.value());
        }
        return initial;
    }

    default long reduce(long initial, LongLongToLongFunction f) {
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            initial = f.value(initial, it.value());
        }
        return initial;
    }

    default char reduce(char initial, CharLongToCharFunction f) {
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            initial = f.value(initial, it.value());
        }
        return initial;
    }

    //views
    default LongStream union(LongStream other) {
        return () -> new LongIterator() {
            private final LongIterator first = LongStream.this.longIterator();
            private LongIterator second;

            public long value() throws NoSuchElementException {
                if (first.isValid()) {
                    return first.value();
                }
                return second.value();
            }

            public boolean advance() throws NoSuchElementException {
                if (first.isValid()) {
                    first.advance();
                    if (!first.isValid()) {
                        second = other.longIterator();
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

    default LongStream filter(LongFilter f) {
        return () -> new LongIterator() {
            private final LongIterator it = LongStream.this.longIterator();

            {
                next();
            }

            private void next() {
                while (it.isValid() && !f.accept(it.value())) {
                    it.advance();
                }
            }

            public long value() {
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

    default DoubleStream map(LongToDoubleFunction function) {
        return () -> new DoubleIterator() {
            private final LongIterator it = LongStream.this.longIterator();

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

    default IntStream map(LongToIntFunction function) {
        return () -> new IntIterator() {
            private final LongIterator it = LongStream.this.longIterator();

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

    default LongStream map(LongToLongFunction function) {
        return () -> new LongIterator() {
            private final LongIterator it = LongStream.this.longIterator();

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

    default CharStream map(LongToCharFunction function) {
        return () -> new CharIterator() {
            private final LongIterator it = LongStream.this.longIterator();

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

    default DoubleStream join(DoubleStream other, LongDoubleToDoubleFunction f) {
        return () -> new DoubleIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default IntStream join(DoubleStream other, LongDoubleToIntFunction f) {
        return () -> new IntIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default LongStream join(DoubleStream other, LongDoubleToLongFunction f) {
        return () -> new LongIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default CharStream join(DoubleStream other, LongDoubleToCharFunction f) {
        return () -> new CharIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default DoubleStream join(IntStream other, LongIntToDoubleFunction f) {
        return () -> new DoubleIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default IntStream join(IntStream other, LongIntToIntFunction f) {
        return () -> new IntIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default LongStream join(IntStream other, LongIntToLongFunction f) {
        return () -> new LongIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default CharStream join(IntStream other, LongIntToCharFunction f) {
        return () -> new CharIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default DoubleStream join(LongStream other, LongLongToDoubleFunction f) {
        return () -> new DoubleIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default IntStream join(LongStream other, LongLongToIntFunction f) {
        return () -> new IntIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default LongStream join(LongStream other, LongLongToLongFunction f) {
        return () -> new LongIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default CharStream join(LongStream other, LongLongToCharFunction f) {
        return () -> new CharIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default DoubleStream join(CharStream other, LongCharToDoubleFunction f) {
        return () -> new DoubleIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default IntStream join(CharStream other, LongCharToIntFunction f) {
        return () -> new IntIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default LongStream join(CharStream other, LongCharToLongFunction f) {
        return () -> new LongIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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

    default CharStream join(CharStream other, LongCharToCharFunction f) {
        return () -> new CharIterator() {
            private final LongIterator it = LongStream.this.longIterator();
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