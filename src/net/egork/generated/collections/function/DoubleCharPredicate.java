package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleCharPredicate {
    boolean value(double first, char second);

    default DoubleFilter setSecond(char second) {
        return v -> value(v, second);
    }

    default CharFilter setFirst(double first) {
        return v -> value(first, v);
    }
}
