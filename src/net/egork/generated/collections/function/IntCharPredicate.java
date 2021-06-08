package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntCharPredicate {
    boolean value(int first, char second);

    default IntFilter setSecond(char second) {
        return v -> value(v, second);
    }

    default CharFilter setFirst(int first) {
        return v -> value(first, v);
    }
}
