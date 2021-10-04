package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharDoubleToIntFunction {
    int value(char first, double second);

    default CharToIntFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToIntFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
