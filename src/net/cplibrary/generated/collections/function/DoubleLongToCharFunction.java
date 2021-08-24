package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleLongToCharFunction {
    char value(double first, long second);

    default DoubleToCharFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToCharFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
