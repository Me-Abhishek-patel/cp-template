package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharDoubleToLongFunction {
    long value(char first, double second);

    default CharToLongFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToLongFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
