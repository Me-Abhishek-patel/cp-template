package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface DoubleIntToCharFunction {
    char value(double first, int second);

    default DoubleToCharFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToCharFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
