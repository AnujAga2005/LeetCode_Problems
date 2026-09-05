/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int total = 0;
    public void find(TreeNode root, long currSum , int target){
        if(root == null) return;
        currSum += root.val;
        if(currSum==target) total++;
        find(root.left , currSum ,target);
        find(root.right , currSum ,target);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        find(root, 0, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return total;
    }
}