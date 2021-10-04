package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharToIntFunction {
    int value(char key);

    default DoubleToIntFunction combine(DoubleToCharFunction f) {
        return val -> value(f.value(val));
    }

    default IntToIntFunction combine(IntToCharFunction f) {
        return val -> value(f.value(val));
    }

    default LongToIntFunction combine(LongToCharFunction f) {
        return val -> value(f.value(val));
    }

    default CharToIntFunction combine(CharToCharFunction f) {
        return val -> value(f.value(val));
    }
}
