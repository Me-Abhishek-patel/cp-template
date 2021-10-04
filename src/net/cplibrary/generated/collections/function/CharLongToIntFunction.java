package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharLongToIntFunction {
    int value(char first, long second);

    default CharToIntFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToIntFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
