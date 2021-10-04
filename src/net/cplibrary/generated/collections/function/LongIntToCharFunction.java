package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongIntToCharFunction {
    char value(long first, int second);

    default LongToCharFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToCharFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
