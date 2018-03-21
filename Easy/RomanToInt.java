/* Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999. /*

/*The only complication is the subtractive rule. This rule makes it possible
for some numbers to be written in a more compact form . It allows a numeral
of a lower value to be placed before one of a higher value to indicate that
the lesser should be subtracted from the greater. Thus IV means 5 - 1 = 4,
and XC = 100 - 10 = 90. */
class Solution {
    public int romanToInt(String s) {

        //Note: Java generics only work with reference types. Must use Integer
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        // We know we have to add the left most value, can't be a detractor
        int result = values.get(s.charAt(s.length()-1));

        // Length gives total, start at 0 so need -1
        // Start at second to last value now, and we can check on the last element which was default added
        // Iterate backword
        for(int i = s.length() - 2; i >= 0; i--){
            if(values.get(s.charAt(i)) >= values.get(s.charAt(i+1))){
                result += values.get(s.charAt(i));
            }else{
                result -= values.get(s.charAt(i));
            }
        }
        return result;
    }
}
