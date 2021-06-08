package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleToCharFunction {
    char value(double key);

    default DoubleToCharFunction combine(DoubleToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default IntToCharFunction combine(IntToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default LongToCharFunction combine(LongToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default CharToCharFunction combine(CharToDoubleFunction f) {
        return val -> value(f.value(val));
    }
}
