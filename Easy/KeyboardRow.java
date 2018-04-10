//Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.


class Solution {
    public String[] findWords(String[] words) {
        List<Character> row1 = Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o','p');
        List<Character> row2 = Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        List<Character> row3 = Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm');

        List<String> returnedStrings = new ArrayList();

        for(String word : words){
            Character initialCh = word.charAt(0);
            int row = -1;

            if(row1.contains(Character.toLowerCase(initialCh))){
                row = 1;
            }
            if(row2.contains(Character.toLowerCase(initialCh))){
                row = 2;
            }
            if(row3.contains(Character.toLowerCase(initialCh))){
                row = 3;
            }

            Boolean good = true;
            for(char c : word.toCharArray()){
                if(row == 1){
                    if(!row1.contains(Character.toLowerCase(c))) good = false;
                }
                if(row == 2){
                    if(!row2.contains(Character.toLowerCase(c))) good = false;
                }
                if(row == 3){
                    if(!row3.contains(Character.toLowerCase(c))) good = false;
                }
            }
            if(good) returnedStrings.add(word);
        }
       return returnedStrings.toArray(new String[returnedStrings.size()]);
    }
}

public class Solution {
    public String[] findWords(String[] words) {
        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            for(char c: strs[i].toCharArray()){
                map.put(c, i);//put <char, rowIndex> pair into the map
            }
        }
        List<String> res = new LinkedList<>();
        for(String w: words){
            if(w.equals("")) continue;
            int index = map.get(w.toUpperCase().charAt(0));
            for(char c: w.toUpperCase().toCharArray()){
                if(map.get(c)!=index){
                    index = -1; //don't need a boolean flag.
                    break;
                }
            }
            if(index!=-1) res.add(w);//if index != -1, this is a valid string
        }
        return res.toArray(new String[0]);
    }
}
