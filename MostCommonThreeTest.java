import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class MostCommonThreeTest {

        @Test
        public void testNormalSentence() {
            MostCommonThree mct = new MostCommonThree();
            String input = "I wanna give a warm applause to a very very important person and he is here and wants to talk";
            List<String> result = mct.mostCommonThree(input);
            assertEquals(List.of("and", "very", "a"), result, "Should return the top 3 most common words");
        }

        @Test
        public void testTiesAlphabeticalOrder() {
            MostCommonThree mct = new MostCommonThree();
            String input = "apple banana banana apple cherry";
            List<String> result = mct.mostCommonThree(input);
            // apple and banana both appear 2 times, cherry once → ties broken alphabetically
            assertEquals(List.of("apple", "banana", "cherry"), result);
        }

        @Test
        public void testLessThanThreeUniqueWords() {
            MostCommonThree mct = new MostCommonThree();
            String input = "hello hello";
            List<String> result = mct.mostCommonThree(input);
            // Only one unique word, should return it
            assertEquals(List.of("hello"), result);
        }

        @Test
        public void testEmptyString() {
            MostCommonThree mct = new MostCommonThree();
            String input = "";
            List<String> result = mct.mostCommonThree(input);
            // No words, should return empty list
            assertEquals(List.of(), result);
        }

        @Test
        public void testPunctuationWords() {
            MostCommonThree mct = new MostCommonThree();
            String input = "hello, hello! world world world";
            List<String> result = mct.mostCommonThree(input);
            // Words with punctuation are counted as-is
            assertEquals(List.of("world", "hello,", "hello!"), result);
        }
    }
