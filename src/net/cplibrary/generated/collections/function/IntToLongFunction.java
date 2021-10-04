package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IntToLongFunction {
    long value(int key);

    default DoubleToLongFunction combine(DoubleToIntFunction f) {
        return val -> value(f.value(val));
    }

    default IntToLongFunction combine(IntToIntFunction f) {
        return val -> value(f.value(val));
    }

    default LongToLongFunction combine(LongToIntFunction f) {
        return val -> value(f.value(val));
    }

    default CharToLongFunction combine(CharToIntFunction f) {
        return val -> value(f.value(val));
    }
}
