package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharToIntFunction {
    int value(char key);

    default DoubleToIntFunction combine(DoubleToCharFunction f) {
        return val -> value(f.value(val));
    }

    default IntToIntFunction combine(IntToCharFunction f) {
        return val -> value(f.value(val));
    }

    default LongToIntFunction combine(LongToCharFunction f) {
        return val -> value(f.value(val));
    }

    default CharToIntFunction combine(CharToCharFunction f) {
        return val -> value(f.value(val));
    }
}
