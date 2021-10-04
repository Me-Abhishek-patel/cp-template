package net.cplibrary.generated.collections.list;

import net.cplibrary.generated.collections.LongReversableCollection;
import net.cplibrary.generated.collections.comparator.LongComparator;
import net.cplibrary.generated.collections.function.*;
import net.cplibrary.generated.collections.iterator.LongIterator;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongList extends LongReversableCollection {
    LongList EMPTY = new LongArray(new long[0]);

    //abstract
    long get(int index);

    void set(int index, long value);

    void addAt(int index, long value);

    void removeAt(int index);

    //base
    default long first() {
        return get(0);
    }

    default long last() {
        return get(size() - 1);
    }

    default void swap(int first, int second) {
        if (first == second) {
            return;
        }
        long temp = get(first);
        set(first, get(second));
        set(second, temp);
    }

    default LongIterator longIterator() {
        return new LongIterator() {
            private int at;
            private boolean removed;

            public long value() {
                if (removed) {
                    throw new IllegalStateException();
                }
                return get(at);
            }

            public boolean advance() {
                at++;
                removed = false;
                return isValid();
            }

            public boolean isValid() {
                return !removed && at < size();
            }

            public void remove() {
                removeAt(at);
                at--;
                removed = true;
            }
        };
    }

    default LongIterator reverseIterator() {
        return new LongIterator() {
            private int at = size() - 1;
            private boolean removed;

            public long value() {
                if (removed) {
                    throw new IllegalStateException();
                }
                return get(at);
            }

            public boolean advance() {
                at--;
                removed = false;
                return isValid();
            }

            public boolean isValid() {
                return !removed && at >= 0;
            }

            public void remove() {
                removeAt(at);
                removed = true;
            }
        };
    }

    @Override
    default void add(long value) {
        addAt(size(), value);
    }

    default void popLast() {
        removeAt(size() - 1);
    }

    default void popFirst() {
        removeAt(0);
    }

    //algorithms
    default int minIndex() {
        long result = Long.MAX_VALUE;
        int size = size();
        int at = -1;
        for (int i = 0; i < size; i++) {
            long current = get(i);
            if (current < result) {
                result = current;
                at = i;
            }
        }
        return at;
    }

    default int minIndex(LongComparator comparator) {
        long result = Long.MIN_VALUE;
        int size = size();
        int at = -1;
        for (int i = 0; i < size; i++) {
            long current = get(i);
            if (result == Long.MIN_VALUE || comparator.compare(result, current) > 0) {
                result = current;
                at = i;
            }
        }
        return at;
    }

    default int maxIndex() {
        long result = Long.MIN_VALUE;
        int size = size();
        int at = -1;
        for (int i = 0; i < size; i++) {
            long current = get(i);
            if (current > result) {
                result = current;
                at = i;
            }
        }
        return at;
    }

    default int maxIndex(LongComparator comparator) {
        long result = Long.MIN_VALUE;
        int size = size();
        int at = -1;
        for (int i = 0; i < size; i++) {
            long current = get(i);
            if (result == Long.MIN_VALUE || comparator.compare(result, current) < 0) {
                result = current;
                at = i;
            }
        }
        return at;
    }

    default LongList sort() {
        sort(LongComparator.DEFAULT);
        return this;
    }

    default LongList sort(LongComparator comparator) {
        Sorter.sort(this, comparator);
        return this;
    }

    default int find(long value) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (get(i) == value) {
                return i;
            }
        }
        return -1;
    }

    default int find(LongFilter filter) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (filter.accept(get(i))) {
                return i;
            }
        }
        return -1;
    }

    default int findLast(long value) {
        for (int i = size() - 1; i >= 0; i--) {
            if (get(i) == value) {
                return i;
            }
        }
        return -1;
    }

    default int findLast(LongFilter filter) {
        for (int i = size() - 1; i >= 0; i--) {
            if (filter.accept(get(i))) {
                return i;
            }
        }
        return -1;
    }

    default boolean nextPermutation() {
        return nextPermutation(LongComparator.DEFAULT);
    }

    default boolean nextPermutation(LongComparator comparator) {
        int size = size();
        long last = get(size - 1);
        for (int i = size - 2; i >= 0; i--) {
            long current = get(i);
            if (comparator.compare(last, current) > 0) {
                for (int j = size - 1; j > i; j--) {
                    if (comparator.compare(get(j), current) > 0) {
                        swap(i, j);
                        subList(i + 1, size).inPlaceReverse();
                        return true;
                    }
                }
            }
            last = current;
        }
        return false;
    }

    default void inPlaceReverse() {
        for (int i = 0, j = size() - 1; i < j; i++, j--) {
            swap(i, j);
        }
    }

    default LongList unique() {
        long last = Long.MIN_VALUE;
        LongList result = new LongArrayList();
        int size = size();
        for (int i = 0; i < size; i++) {
            long current = get(i);
            if (current != last) {
                result.add(current);
                last = current;
            }
        }
        return result;
    }

    default int mismatch(LongList l) {
        int size = Math.min(size(), l.size());
        for (int i = 0; i < size; i++) {
            if (get(i) != l.get(i)) {
                return i;
            }
        }
        if (size() != l.size()) {
            return size;
        }
        return -1;
    }

    default int mismatch(DoubleList l, LongDoublePredicate p) {
        int size = Math.min(size(), l.size());
        for (int i = 0; i < size; i++) {
            if (!p.value(get(i), l.get(i))) {
                return i;
            }
        }
        if (size() != l.size()) {
            return size;
        }
        return -1;
    }

    default int mismatch(IntList l, LongIntPredicate p) {
        int size = Math.min(size(), l.size());
        for (int i = 0; i < size; i++) {
            if (!p.value(get(i), l.get(i))) {
                return i;
            }
        }
        if (size() != l.size()) {
            return size;
        }
        return -1;
    }

    default int mismatch(LongList l, LongLongPredicate p) {
        int size = Math.min(size(), l.size());
        for (int i = 0; i < size; i++) {
            if (!p.value(get(i), l.get(i))) {
                return i;
            }
        }
        if (size() != l.size()) {
            return size;
        }
        return -1;
    }

    default int mismatch(CharList l, LongCharPredicate p) {
        int size = Math.min(size(), l.size());
        for (int i = 0; i < size; i++) {
            if (!p.value(get(i), l.get(i))) {
                return i;
            }
        }
        if (size() != l.size()) {
            return size;
        }
        return -1;
    }

    default LongList fill(long value) {
        int size = size();
        for (int i = 0; i < size; i++) {
            set(i, value);
        }
        return this;
    }

    default LongList fill(IntToLongFunction f) {
        int size = size();
        for (int i = 0; i < size; i++) {
            set(i, f.value(i));
        }
        return this;
    }

    default LongList replace(long sample, long value) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (get(i) == sample) {
                set(i, value);
            }
        }
        return this;
    }

    default LongList replace(LongFilter f, long value) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (f.accept(get(i))) {
                set(i, value);
            }
        }
        return this;
    }

    default int binarySearch(LongFilter f) {
        int left = 0;
        int right = size();
        while (left < right) {
            int middle = (left + right) >> 1;
            if (f.accept(get(middle))) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    default int moreOrEqual(long value) {
        int left = 0;
        int right = size();
        while (left < right) {
            int middle = (left + right) >> 1;
            if (value <= get(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    default int moreOrEqual(long value, LongComparator c) {
        int left = 0;
        int right = size();
        while (left < right) {
            int middle = (left + right) >> 1;
            if (c.compare(value, get(middle)) <= 0) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    default int more(long value) {
        int left = 0;
        int right = size();
        while (left < right) {
            int middle = (left + right) >> 1;
            if (value < get(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    default int more(long value, LongComparator c) {
        int left = 0;
        int right = size();
        while (left < right) {
            int middle = (left + right) >> 1;
            if (c.compare(value, get(middle)) < 0) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    //views
    default LongList subList(final int from, final int to) {
        return new LongList() {
            private final int shift;
            private final int size;

            {
                if (from < 0 || from > to || to > LongList.this.size()) {
                    throw new IndexOutOfBoundsException("from = " + from + ", to = " + to + ", size = " + size());
                }
                shift = from;
                size = to - from;
            }

            public int size() {
                return size;
            }

            public long get(int at) {
                if (at < 0 || at >= size) {
                    throw new IndexOutOfBoundsException("at = " + at + ", size = " + size());
                }
                return LongList.this.get(at + shift);
            }

            public void addAt(int index, long value) {
                throw new UnsupportedOperationException();
            }

            public void removeAt(int index) {
                throw new UnsupportedOperationException();
            }

            public void set(int at, long value) {
                if (at < 0 || at >= size) {
                    throw new IndexOutOfBoundsException("at = " + at + ", size = " + size());
                }
                LongList.this.set(at + shift, value);
            }

            public LongList compute() {
                return new LongArrayList(this);
            }
        };
    }
}
