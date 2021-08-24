package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharIntToDoubleFunction {
    double value(char first, int second);

    default CharToDoubleFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToDoubleFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
