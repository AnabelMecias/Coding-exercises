import java.util.LinkedHashSet;
import java.util.Set;

public class TraverseString {
    public static String traveString (String sentence) {
        Set<Character> characters = new LinkedHashSet<>();
        for (char character : sentence.toCharArray()) {
            characters.add(character);
        }
        StringBuilder builder = new StringBuilder();
        for (Character character : characters) {
            builder.append(character);
        }
        return builder.toString();
    }
}
