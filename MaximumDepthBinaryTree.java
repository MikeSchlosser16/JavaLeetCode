/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 // O(n), go over each node once
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int dr = 0;
        int dl = 0;

        dl = maxDepth(root.left);
        dr = maxDepth(root.right);

        return(Math.max(dr,dl) + 1);
    }
}


// Cleaner
public int maxDepth(TreeNode root) {
    if (root == null) return 0;
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
}
