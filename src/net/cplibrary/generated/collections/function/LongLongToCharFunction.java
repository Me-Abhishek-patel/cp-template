package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongLongToCharFunction {
    char value(long first, long second);

    default LongToCharFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToCharFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
