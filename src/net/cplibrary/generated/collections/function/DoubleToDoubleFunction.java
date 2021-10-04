package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface DoubleToDoubleFunction {
    double value(double key);

    default DoubleToDoubleFunction combine(DoubleToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default IntToDoubleFunction combine(IntToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default LongToDoubleFunction combine(LongToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default CharToDoubleFunction combine(CharToDoubleFunction f) {
        return val -> value(f.value(val));
    }
}
