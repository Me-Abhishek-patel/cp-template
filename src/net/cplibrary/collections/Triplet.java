package net.cplibrary.collections;

import java.util.Objects;

public class Triplet<U, V, W> implements Comparable<Triplet<U, V, W>> {

    public final U first;
    public final V second;
    public final W third;

    public Triplet(U first, V second, W third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static <U, V, W> Triplet<U, V, W> makeTriplet(U first, V second, W third) {
        return new Triplet<U, V, W>(first, second, third);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triplet)) return false;
        Triplet<?, ?, ?> triplet = (Triplet<?, ?, ?>) o;
        return first.equals(triplet.first) && second.equals(triplet.second) && third.equals(triplet.third);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third);
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third + ")";
    }

    @Override
    @SuppressWarnings({"unchecked"})
    public int compareTo(Triplet<U, V, W> o) {
        int value = ((Comparable<U>) first).compareTo(o.first);
        if (value != 0) {
            return value;
        }
        value = ((Comparable<V>) second).compareTo(o.second);
        if (value != 0) {
            return value;
        }
        return ((Comparable<W>) third).compareTo(o.third);
    }
}
