package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharCharToDoubleFunction {
    double value(char first, char second);

    default CharToDoubleFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToDoubleFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
