package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IntCharToCharFunction {
    char value(int first, char second);

    default IntToCharFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToCharFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
