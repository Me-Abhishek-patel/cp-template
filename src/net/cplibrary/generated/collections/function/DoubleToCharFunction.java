package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
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
