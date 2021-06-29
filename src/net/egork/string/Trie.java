package net.egork.string;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public class Trie {
    public final Node root = new Node();

    public void add(CharSequence word) {
        Node current = root;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char letter = word.charAt(i);
            if (current.links[letter] == null) {
                current.links[letter] = new Node();
            }
            current = current.links[letter];
        }
        current.leaf = true;
    }

    public Visitor getVisitor() {
        return new Visitor();
    }

    public static class Node {
        public final Node[] links = new Node[128];
        public boolean leaf = false;
    }

    public class Visitor {
        private Node node = root;

        private Visitor() {
        }

        public boolean accept(char letter) {
            if (node == null) {
                return false;
            }
            node = node.links[letter];
            if (node == null) {
                return false;
            }
            if (node.leaf) {
                node = root;
            }
            return true;
        }

        public boolean isAtRoot() {
            return node == root;
        }
    }
}
