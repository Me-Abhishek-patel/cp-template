package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharDoublePredicate {
    boolean value(char first, double second);

    default CharFilter setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleFilter setFirst(char first) {
        return v -> value(first, v);
    }
}
