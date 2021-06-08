package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongDoubleToCharFunction {
    char value(long first, double second);

    default LongToCharFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToCharFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
