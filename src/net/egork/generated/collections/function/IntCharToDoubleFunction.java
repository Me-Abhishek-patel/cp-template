package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntCharToDoubleFunction {
    double value(int first, char second);

    default IntToDoubleFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToDoubleFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
