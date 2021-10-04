package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
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
