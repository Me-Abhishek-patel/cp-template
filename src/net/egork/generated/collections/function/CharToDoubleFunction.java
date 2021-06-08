package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharToDoubleFunction {
    double value(char key);

    default DoubleToDoubleFunction combine(DoubleToCharFunction f) {
        return val -> value(f.value(val));
    }

    default IntToDoubleFunction combine(IntToCharFunction f) {
        return val -> value(f.value(val));
    }

    default LongToDoubleFunction combine(LongToCharFunction f) {
        return val -> value(f.value(val));
    }

    default CharToDoubleFunction combine(CharToCharFunction f) {
        return val -> value(f.value(val));
    }
}
