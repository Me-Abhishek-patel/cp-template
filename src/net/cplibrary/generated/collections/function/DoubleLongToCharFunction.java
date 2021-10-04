package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface DoubleLongToCharFunction {
    char value(double first, long second);

    default DoubleToCharFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToCharFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
