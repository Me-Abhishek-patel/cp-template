package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongToCharFunction {
    char value(long key);

    default DoubleToCharFunction combine(DoubleToLongFunction f) {
        return val -> value(f.value(val));
    }

    default IntToCharFunction combine(IntToLongFunction f) {
        return val -> value(f.value(val));
    }

    default LongToCharFunction combine(LongToLongFunction f) {
        return val -> value(f.value(val));
    }

    default CharToCharFunction combine(CharToLongFunction f) {
        return val -> value(f.value(val));
    }
}
