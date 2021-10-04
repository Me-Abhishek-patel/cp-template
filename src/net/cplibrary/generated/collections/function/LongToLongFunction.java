package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongToLongFunction {
    long value(long key);

    default DoubleToLongFunction combine(DoubleToLongFunction f) {
        return val -> value(f.value(val));
    }

    default IntToLongFunction combine(IntToLongFunction f) {
        return val -> value(f.value(val));
    }

    default LongToLongFunction combine(LongToLongFunction f) {
        return val -> value(f.value(val));
    }

    default CharToLongFunction combine(CharToLongFunction f) {
        return val -> value(f.value(val));
    }
}
