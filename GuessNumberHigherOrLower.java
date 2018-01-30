/* 
We are playing the Guess Game. The game is as follows:
I pick a number from 1 to n. You have to guess which number I picked.
Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */


// Basic binary search
// Binary searh runs at O(log n)
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return binarySearch(1, n);  
    }
    
    public int binarySearch(int start, int end){
        if(start > end) return -1;
        else if (guess(start) == 0) return start;
        else if (guess(end) == 0) return end;
        
        int middle = start + (end - start) / 2;
        if(guess(middle) == 0) return middle;
        else if(guess(middle) == -1) return binarySearch(start+1, middle-1);
        else return binarySearch(middle+1, end-1);
    }
}