package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongToDoubleFunction {
    double value(long key);

    default DoubleToDoubleFunction combine(DoubleToLongFunction f) {
        return val -> value(f.value(val));
    }

    default IntToDoubleFunction combine(IntToLongFunction f) {
        return val -> value(f.value(val));
    }

    default LongToDoubleFunction combine(LongToLongFunction f) {
        return val -> value(f.value(val));
    }

    default CharToDoubleFunction combine(CharToLongFunction f) {
        return val -> value(f.value(val));
    }
}
