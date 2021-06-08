package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleCharToDoubleFunction {
    double value(double first, char second);

    default DoubleToDoubleFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToDoubleFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
