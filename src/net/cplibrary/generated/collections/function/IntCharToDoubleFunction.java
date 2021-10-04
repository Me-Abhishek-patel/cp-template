package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IntCharToDoubleFunction {
    double value(int first, char second);

    default IntToDoubleFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToDoubleFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
