import java.util.ArrayList;
import java.util.List;

public class LongestString{

    public void longestString(String inputString){

        //Initialize the variables
        //TO keep track of the longest
        int longest = 0;
        int currentLength = 0;

        //Keep track of visited characters

        List<Character> visited = new ArrayList<>();


        //through all the characters
        for(char i : inputString){

            if (visited.contains(i)){
                currentLength=0;
                visited.clear();
            }

                currentLength ++;
                visited.add(i);
                longest = Math.max(longest,currentLength);

        }
        return longest;


    }

    public static void main(String[] args){
        LongestString longestString = new LongestString();

        System.out.println(longestString.longestString("ASDLFHEOWIHFROWHF"));
    }


}
