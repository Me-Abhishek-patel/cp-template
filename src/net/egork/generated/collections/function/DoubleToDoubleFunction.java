package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleToDoubleFunction {
    double value(double key);

    default DoubleToDoubleFunction combine(DoubleToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default IntToDoubleFunction combine(IntToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default LongToDoubleFunction combine(LongToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default CharToDoubleFunction combine(CharToDoubleFunction f) {
        return val -> value(f.value(val));
    }
}
