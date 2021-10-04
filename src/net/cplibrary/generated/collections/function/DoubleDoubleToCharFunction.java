package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface DoubleDoubleToCharFunction {
    char value(double first, double second);

    default DoubleToCharFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToCharFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
