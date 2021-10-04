package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface DoubleCharToLongFunction {
    long value(double first, char second);

    default DoubleToLongFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToLongFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
