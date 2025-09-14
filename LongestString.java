import java.util.ArrayList;
import java.util.List;

public class LongestString{

    String longesString="";
    public String longestString(String[] inputString,List<Character> validCharacters){
        for(String s:inputString){
            if (isValid(s,validCharacters)&&s.length()>longesString.length()){
                longesString=s;
            }
        }
        return longesString;

    }
    public boolean isValid(String s,List<Character> validCharacters)
    {
        //Vlaidity check

        //1. if current char in the list of valid chars

        for (char c : s.toCharArray()){
            if(!validCharacters.contains(c)){
                return false;
            }
        }
        ///if consecutice similar charactes
        for(int i=1; i< s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        LongestString ls = new LongestString();

        String[] inputStrings = {"waradis", "afhiaweufh", "AGSUWGYW"};
        List<Character> validCharacters = List.of('A', 'B', 'D', 'G', 'S', 'U', 'W', 'Y', 'R', 'I');

        System.out.println(ls.longestString(inputStrings,validCharacters));
    }
}
