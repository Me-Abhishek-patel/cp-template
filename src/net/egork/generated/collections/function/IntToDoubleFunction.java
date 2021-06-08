package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntToDoubleFunction {
    double value(int key);

    default DoubleToDoubleFunction combine(DoubleToIntFunction f) {
        return val -> value(f.value(val));
    }

    default IntToDoubleFunction combine(IntToIntFunction f) {
        return val -> value(f.value(val));
    }

    default LongToDoubleFunction combine(LongToIntFunction f) {
        return val -> value(f.value(val));
    }

    default CharToDoubleFunction combine(CharToIntFunction f) {
        return val -> value(f.value(val));
    }
}
