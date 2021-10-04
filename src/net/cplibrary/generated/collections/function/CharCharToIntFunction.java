package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharCharToIntFunction {
    int value(char first, char second);

    default CharToIntFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToIntFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
