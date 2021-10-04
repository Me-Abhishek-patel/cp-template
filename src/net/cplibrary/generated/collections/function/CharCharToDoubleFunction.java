package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharCharToDoubleFunction {
    double value(char first, char second);

    default CharToDoubleFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToDoubleFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
