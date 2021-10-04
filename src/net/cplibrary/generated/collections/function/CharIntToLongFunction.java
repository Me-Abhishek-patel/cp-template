package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharIntToLongFunction {
    long value(char first, int second);

    default CharToLongFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToLongFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
