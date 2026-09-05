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
    public void find(HashMap<Long,Integer> hm, TreeNode root, Long currSum , int target){
        if(root==null) return;
        currSum += root.val;
        if(hm.containsKey(currSum-target)){
            total += hm.get(currSum-target);
        }
        hm.put(currSum , hm.getOrDefault(currSum,0)+1);
        find(hm , root.left, currSum , target);
        find(hm , root.right, currSum , target);
        hm.put(currSum, hm.get(currSum)-1);
        return;
        
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null ) return 0;
        HashMap<Long, Integer> hm = new HashMap<>();
        hm.put(0L,1);
        find(hm, root,0L,targetSum);
        return total;
    }
}