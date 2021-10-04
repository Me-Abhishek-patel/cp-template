package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharDoubleToCharFunction {
    char value(char first, double second);

    default CharToCharFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToCharFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
