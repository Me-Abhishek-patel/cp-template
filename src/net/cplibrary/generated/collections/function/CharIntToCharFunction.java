package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharIntToCharFunction {
    char value(char first, int second);

    default CharToCharFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToCharFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
