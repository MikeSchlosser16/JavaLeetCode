/*Given an integer array with even length, where different numbers in this array represent different kinds of candies. Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister. Return the maximum number of kinds of candies the sister could gain.
Example 1:
Input: candies = [1,1,2,2,3,3]
Output: 3
Explanation:
There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too.
The sister has three different kinds of candies. */



//The maximum no. of unique candies which the girl can obtain could be atmost n/2n/2, where nn refers to the number of candies. Further, in case the number of unique candies are below n/2n/2, to maximize the number of unique candies that the girl will obtain, we'll assign all the unique candies to the girl. Thus, in such a case, the number of unique candies the girl gets is equal to the total number of unique candies in the given candiescandies array.
class Solution {
    public int distributeCandies(int[] candies) {
        // No duplicates in set
        Set<Integer> candySet = new HashSet<>();

        for(int candy : candies)
            candySet.add(candy);
        // The sister can get at most half the candies, of the number of unique candies. Which ever is lower is the answer
        return Math.min(candySet.size(), candies.length / 2);

    }
}
