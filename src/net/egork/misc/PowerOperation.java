package net.egork.misc;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface PowerOperation<V> extends Operation<V> {
    V power(V base, int exponent);
}
