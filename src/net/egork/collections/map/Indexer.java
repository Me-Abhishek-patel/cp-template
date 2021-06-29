package net.egork.collections.map;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public class Indexer<K> extends EHashMap<K, Integer> {
    private int index = 0;

    @Override
    public Integer get(Object key) {
        if (!containsKey(key)) {
            put((K) key, index++);
        }
        return super.get(key);
    }
}
