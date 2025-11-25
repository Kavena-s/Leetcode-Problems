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
    int min1;
    long ans = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        dfs(root);
        return ans == Long.MAX_VALUE ? -1 : (int)ans;
    }
    private void dfs(TreeNode node){
        if(node == null) return;
        if(node.val > ans) return;
        if(node.val > min1 && node.val < ans)   
            ans = node.val;
        dfs(node.left);
        dfs(node.right);
    }
}