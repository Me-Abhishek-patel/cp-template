package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharToCharFunction {
    char value(char key);

    default DoubleToCharFunction combine(DoubleToCharFunction f) {
        return val -> value(f.value(val));
    }

    default IntToCharFunction combine(IntToCharFunction f) {
        return val -> value(f.value(val));
    }

    default LongToCharFunction combine(LongToCharFunction f) {
        return val -> value(f.value(val));
    }

    default CharToCharFunction combine(CharToCharFunction f) {
        return val -> value(f.value(val));
    }
}
