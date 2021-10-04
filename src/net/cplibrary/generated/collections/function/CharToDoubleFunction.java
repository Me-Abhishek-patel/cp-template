package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
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
