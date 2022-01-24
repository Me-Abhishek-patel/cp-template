package net.cplibrary.collections;

import java.util.Objects;

public class Quadruple<U, V, W, X> implements Comparable<Quadruple<U, V, W, X>> {

    public final U first;
    public final V second;
    public final W third;
    public final X fourth;

    public Quadruple(U first, V second, W third, X fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public static <U, V, W, X> Quadruple<U, V, W, X> makeQuadruple(U first, V second, W third, X fourth) {
        return new Quadruple<U, V, W, X>(first, second, third, fourth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quadruple)) return false;
        Quadruple<?, ?, ?, ?> quadruple = (Quadruple<?, ?, ?, ?>) o;
        return Objects.equals(first, quadruple.first) && Objects.equals(second, quadruple.second) && Objects.equals(third, quadruple.third) && Objects.equals(fourth, quadruple.fourth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third, fourth);
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third + "," + fourth + ")";
    }

    @Override
    @SuppressWarnings({"unchecked"})
    public int compareTo(Quadruple<U, V, W, X> o) {
        int value = ((Comparable<U>) first).compareTo(o.first);
        if (value != 0) {
            return value;
        }
        value = ((Comparable<V>) second).compareTo(o.second);
        if (value != 0) {
            return value;
        }
        value = ((Comparable<W>) third).compareTo(o.third);
        if (value != 0) {
            return value;
        }
        return ((Comparable<X>) fourth).compareTo(o.fourth);
    }
}


