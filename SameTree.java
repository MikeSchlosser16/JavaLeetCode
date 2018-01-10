/*
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.


Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


//Note that the nodes have value of null to check for, not the int val values
//Trees often signal recursion, thats what we are doing here
// Checking 'one offs' with the null checks, and then we need a base case at the very bottom
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //If both are null, we have made it to the end of the tree and are good - the same
        //This is a base case, but also handles being given two empty trees
        if(p == null && q == null){
            return true;
        }
        //We know both are not null so if just one is, tree not the same
        else if(p == null || q == null){
            return false;
        //Both nodes have values; descend iff those values are equal
        }else if(p.val == q.val){
            //Recursive call to check nodes downward

            return isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
        }else{
            // If we're here, both nodes have values, and they're unequal, so the trees aren't the same
            return false; 
        }
    }
}


//The same thing but much more readable
public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    if(p.val == q.val)
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    return false;
}