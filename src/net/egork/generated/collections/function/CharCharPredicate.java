package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharCharPredicate {
    boolean value(char first, char second);

    default CharFilter setSecond(char second) {
        return v -> value(v, second);
    }

    default CharFilter setFirst(char first) {
        return v -> value(first, v);
    }
}
