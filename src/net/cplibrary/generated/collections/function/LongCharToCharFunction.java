package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongCharToCharFunction {
    char value(long first, char second);

    default LongToCharFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToCharFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
