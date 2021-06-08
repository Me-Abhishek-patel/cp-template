package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntToCharFunction {
    char value(int key);

    default DoubleToCharFunction combine(DoubleToIntFunction f) {
        return val -> value(f.value(val));
    }

    default IntToCharFunction combine(IntToIntFunction f) {
        return val -> value(f.value(val));
    }

    default LongToCharFunction combine(LongToIntFunction f) {
        return val -> value(f.value(val));
    }

    default CharToCharFunction combine(CharToIntFunction f) {
        return val -> value(f.value(val));
    }
}
