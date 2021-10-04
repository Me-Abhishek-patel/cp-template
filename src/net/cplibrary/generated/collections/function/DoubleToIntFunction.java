package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface DoubleToIntFunction {
    int value(double key);

    default DoubleToIntFunction combine(DoubleToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default IntToIntFunction combine(IntToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default LongToIntFunction combine(LongToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default CharToIntFunction combine(CharToDoubleFunction f) {
        return val -> value(f.value(val));
    }
}
