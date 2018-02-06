/*Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24. */

/*Important part here is to realize the 'base case': if the left child is a leaf(nothing under, right and left null)
Otherwise, keep going until it is. 
The repeat process for right half of the tree.  */

class Solution {
  public int sumOfLeftLeaves(TreeNode root) {
    if(root == null) return 0; // Edge case
    int ans = 0;
    if(root.left != null) { //There is a left part of root, so we need to add some values
        if(root.left.left == null && root.left.right == null) ans += root.left.val; //For given node we check whether its left child is a leaf. If it is the case, we add its value to answer
        else ans += sumOfLeftLeaves(root.left); //Not a child leaf, so keep checking though left half of tree
    }
    ans += sumOfLeftLeaves(root.right); // Check the right side of the tree
    
    return ans;
    }
}