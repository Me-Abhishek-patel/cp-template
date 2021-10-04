package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IntCharToIntFunction {
    int value(int first, char second);

    default IntToIntFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToIntFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
