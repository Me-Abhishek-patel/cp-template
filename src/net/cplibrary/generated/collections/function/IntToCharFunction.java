package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IntToCharFunction {
    char value(int key);

    default DoubleToCharFunction combine(DoubleToIntFunction f) {
        return val -> value(f.value(val));
    }

    default IntToCharFunction combine(IntToIntFunction f) {
        return val -> value(f.value(val));
    }

    default LongToCharFunction combine(LongToIntFunction f) {
        return val -> value(f.value(val));
    }

    default CharToCharFunction combine(CharToIntFunction f) {
        return val -> value(f.value(val));
    }
}
