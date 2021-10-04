package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharIntToDoubleFunction {
    double value(char first, int second);

    default CharToDoubleFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToDoubleFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
