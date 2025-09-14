import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumDistanceTest {
    @Test
    void testMinimumDistance_BasicCase() {
        MinimumDistance m = new MinimumDistance();
        int[] nums = {5, 1, 3, 4, 1, 7};
        assertEquals(3, m.minimumDistance(nums));
    }

    @Test
    void testMinimumDistance_AllSameNumbers() {
        MinimumDistance m = new MinimumDistance();
        int[] nums = {2, 2, 2, 2};
        assertEquals(1, m.minimumDistance(nums));
    }
    @Test
    void testMinimumDistance_MinAtStartAndEnd() {
        MinimumDistance m = new MinimumDistance();
        int[] nums = {1, 4, 5, 6, 1};
        assertEquals(4, m.minimumDistance(nums));
    }

    @Test
    void testMinimumDistance_CloseMinimums() {
        MinimumDistance m = new MinimumDistance();
        int[] nums = {7, 1, 1, 5, 8};
        assertEquals(1, m.minimumDistance(nums));
    }

}