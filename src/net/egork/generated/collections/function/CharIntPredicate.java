package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharIntPredicate {
    boolean value(char first, int second);

    default CharFilter setSecond(int second) {
        return v -> value(v, second);
    }

    default IntFilter setFirst(char first) {
        return v -> value(first, v);
    }
}
