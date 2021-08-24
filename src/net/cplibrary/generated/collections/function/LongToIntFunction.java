package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongToIntFunction {
    int value(long key);

    default DoubleToIntFunction combine(DoubleToLongFunction f) {
        return val -> value(f.value(val));
    }

    default IntToIntFunction combine(IntToLongFunction f) {
        return val -> value(f.value(val));
    }

    default LongToIntFunction combine(LongToLongFunction f) {
        return val -> value(f.value(val));
    }

    default CharToIntFunction combine(CharToLongFunction f) {
        return val -> value(f.value(val));
    }
}
