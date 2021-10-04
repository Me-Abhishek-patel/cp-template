package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharCharToCharFunction {
    char value(char first, char second);

    default CharToCharFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToCharFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
