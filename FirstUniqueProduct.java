import java.util.List;
import java.util.ArrayList;

class FirstUniqueProduct{

    public String firstUniqProduct(String[] inputString){
        String uniqueString=null;
        List<String> visited=new ArrayList<>();
        for(String unique: inputString){
            if(visited.contains(unique)){
                visited.remove(unique);
            }
            visited.add(unique);

        }
        return visited.get(0);
    }
    public static void main(String[] args) {
        FirstUniqueProduct firstUniqueProduct=new FirstUniqueProduct();
        String[] inputString={"a","b","c","d","e","a","f","g","b","b"};
        System.out.println(firstUniqueProduct.firstUniqProduct(inputString));
    }
}