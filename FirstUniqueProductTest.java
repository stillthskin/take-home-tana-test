import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class FirstUniqueProductTest {
    @Test
    void testAllUniqueElements() {
        FirstUniqueProduct fup = new FirstUniqueProduct();
        String[] input = {"a", "b", "c", "d", "e"};
        String result = fup.firstUniqProduct(input);
        assertEquals("a", result, "Should return first element if all are unique");
    }
    @Test
    void testMultipleDuplicates() {
        FirstUniqueProduct fup = new FirstUniqueProduct();
        String[] input = {"a", "b", "a", "b", "c", "d"};
        String result = fup.firstUniqProduct(input);
        assertEquals("c", result, "Your code ends with ['c','d'], so first is 'c'");
    }
    @Test
    void testEmptyArray() {
        FirstUniqueProduct fup = new FirstUniqueProduct();
        String[] input = {};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            fup.firstUniqProduct(input);
        }, "Empty input should throw IndexOutOfBoundsException since visited.get(0) fails");
    }
}