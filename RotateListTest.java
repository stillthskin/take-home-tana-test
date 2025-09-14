import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

class StringListRotationTest {

    @Test
    void testRotateRightByTwo() {
        RotateList rotator = new RotateList();
        List<String> input = Arrays.asList("a", "b", "c", "d", "e");
        List<String> expected = Arrays.asList("d", "e", "a", "b", "c");
        assertEquals(expected, rotator.rotateRight(input, 2));
    }

    @Test
    void testRotateRightByZero() {
        RotateList rotator = new RotateList();
        List<String> input = Arrays.asList("a", "b", "c", "d");
        List<String> expected = Arrays.asList("a", "b", "c", "d");
        assertEquals(expected, rotator.rotateRight(input, 0)); // No rotation
    }

    @Test
    void testRotateRightByListSize() {
        RotateList rotator = new RotateList();
        List<String> input = Arrays.asList("x", "y", "z");
        List<String> expected = Arrays.asList("x", "y", "z");
        assertEquals(expected, rotator.rotateRight(input, 3)); // Rotating by size returns original
    }

    @Test
    void testRotateRightByMoreThanListSize() {
        RotateList rotator = new RotateList();
        List<String> input = Arrays.asList("1", "2", "3", "4");
        List<String> expected = Arrays.asList("3", "4", "1", "2");
        assertEquals(expected, rotator.rotateRight(input, 6)); // 6 % 4 = 2 → right rotate by 2
    }

    @Test
    void testRotateRightSingleElement() {
        RotateList rotator = new RotateList();
        List<String> input = Collections.singletonList("only");
        List<String> expected = Collections.singletonList("only");
        assertEquals(expected, rotator.rotateRight(input, 10)); // Any rotation keeps single element same
    }
}
