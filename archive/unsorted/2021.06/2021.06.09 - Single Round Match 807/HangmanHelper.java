package codes;

import java.util.HashSet;
import java.util.Set;

public class HangmanHelper {
    public String show(String secretWord, String lettersGuessed) {
        Set<Character> set = new HashSet<>();
        for (char c : lettersGuessed.toCharArray()) set.add(c);
        StringBuilder sb = new StringBuilder();
        for (char c : secretWord.toCharArray() ) {
            if(set.contains(c))sb.append(c);
            else sb.append("_");
        }
        return sb.toString();
    }
}
