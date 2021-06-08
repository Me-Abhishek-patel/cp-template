package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharDoubleToIntFunction {
    int value(char first, double second);

    default CharToIntFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToIntFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
