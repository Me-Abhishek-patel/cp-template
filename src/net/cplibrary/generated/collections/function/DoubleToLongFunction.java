package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleToLongFunction {
    long value(double key);

    default DoubleToLongFunction combine(DoubleToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default IntToLongFunction combine(IntToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default LongToLongFunction combine(LongToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default CharToLongFunction combine(CharToDoubleFunction f) {
        return val -> value(f.value(val));
    }
}
