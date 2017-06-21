import java.util.ArrayList;

public class CountUniqueCharacters {

    static int countUniqueCharacters(String str){
        ArrayList<Character> characterList = new ArrayList<Character>();
        characterList.add(str.charAt(0));
        for (int i = 1; i < str.length(); i++){
            boolean charAvailable = checkArrayList(characterList, str.charAt(i));
            if (charAvailable){
                characterList.add(str.charAt(i));
            }
        }
        return characterList.size();
    }

    static boolean checkArrayList(ArrayList<Character> list, char currentChar){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == currentChar){
                return false;
            }
        }
        return true;
    }
}
