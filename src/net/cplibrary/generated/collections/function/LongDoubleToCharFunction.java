package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongDoubleToCharFunction {
    char value(long first, double second);

    default LongToCharFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToCharFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
