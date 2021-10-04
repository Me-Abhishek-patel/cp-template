package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharCharToLongFunction {
    long value(char first, char second);

    default CharToLongFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToLongFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
