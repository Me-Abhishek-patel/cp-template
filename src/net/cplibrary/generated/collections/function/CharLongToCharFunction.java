package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharLongToCharFunction {
    char value(char first, long second);

    default CharToCharFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToCharFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
