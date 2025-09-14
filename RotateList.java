import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class RotateList {

    public List<String> rotateRight(List<String> input, int k) {
        int n = input.size();
        //Create a list empyt string equal to the length of list
        List<String> rotated = new ArrayList<>(Collections.nCopies(n, ""));

        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            rotated.set(newIndex, input.get(i));
        }

        return rotated;
    }

        public static void main(String[] args) {
            RotateList rt = new RotateList();
            List<String> list = Arrays.asList("a", "b", "c", "d", "e");
            System.out.println(rt.rotateRight(list, 2));

        }

}