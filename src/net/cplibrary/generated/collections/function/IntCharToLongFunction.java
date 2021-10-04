package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IntCharToLongFunction {
    long value(int first, char second);

    default IntToLongFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToLongFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
