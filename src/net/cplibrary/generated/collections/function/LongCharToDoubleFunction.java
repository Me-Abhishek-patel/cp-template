package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongCharToDoubleFunction {
    double value(long first, char second);

    default LongToDoubleFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToDoubleFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
