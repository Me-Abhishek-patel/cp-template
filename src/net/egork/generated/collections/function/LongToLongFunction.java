package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongToLongFunction {
    long value(long key);

    default DoubleToLongFunction combine(DoubleToLongFunction f) {
        return val -> value(f.value(val));
    }

    default IntToLongFunction combine(IntToLongFunction f) {
        return val -> value(f.value(val));
    }

    default LongToLongFunction combine(LongToLongFunction f) {
        return val -> value(f.value(val));
    }

    default CharToLongFunction combine(CharToLongFunction f) {
        return val -> value(f.value(val));
    }
}
