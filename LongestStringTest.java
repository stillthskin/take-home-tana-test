import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class LongestStringTest {


    @Test
    public void testValidLongestString() {
        LongestString ls = new LongestString();

        String[] inputStrings = {"AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA"};
        List<Character> validCharacters = List.of('A', 'B', 'C', 'D');
        String result = ls.longestString(inputStrings, validCharacters);
        assertEquals("ABCDABDCA", result, "Should return the longest valid string");
    }
    @Test
    public void testAllInvalidStrings() {
        LongestString ls = new LongestString();

        String[] inputStrings = {"AA", "ZZZ", "DDDDA"};
        List<Character> validCharacters = List.of('A', 'B', 'C', 'D');
        String result = ls.longestString(inputStrings, validCharacters);
        assertEquals("", result, "Should return empty string when no valid string exists");
    }
    @Test
    public void testSingleValidString() {
        LongestString ls = new LongestString();

        String[] inputStrings = {"AABC", "ABCD"};
        List<Character> validCharacters = List.of('A', 'B', 'C', 'D');
        String result = ls.longestString(inputStrings, validCharacters);
        assertEquals("ABCD", result, "Should return the only valid string");
    }
    @Test
    public void testEmptyStringArray() {
        LongestString checker = new LongestString();

        String[] inputStrings = {}; // No strings at all
        List<Character> validCharacters = List.of('A', 'B', 'C', 'D');
        String result = checker.longestString(inputStrings, validCharacters);
        assertEquals("", result, "Should return empty string when no input is provided");
    }
}