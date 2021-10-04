package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IntDoubleToCharFunction {
    char value(int first, double second);

    default IntToCharFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToCharFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
