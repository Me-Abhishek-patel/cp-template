package net.egork.misc;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface Operation<V> extends Factory<V> {
    V operation(V first, V second);
}
