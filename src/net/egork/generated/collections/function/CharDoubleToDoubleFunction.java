package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharDoubleToDoubleFunction {
    double value(char first, double second);

    default CharToDoubleFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToDoubleFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
