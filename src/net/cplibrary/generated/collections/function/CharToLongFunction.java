package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharToLongFunction {
    long value(char key);

    default DoubleToLongFunction combine(DoubleToCharFunction f) {
        return val -> value(f.value(val));
    }

    default IntToLongFunction combine(IntToCharFunction f) {
        return val -> value(f.value(val));
    }

    default LongToLongFunction combine(LongToCharFunction f) {
        return val -> value(f.value(val));
    }

    default CharToLongFunction combine(CharToCharFunction f) {
        return val -> value(f.value(val));
    }
}
