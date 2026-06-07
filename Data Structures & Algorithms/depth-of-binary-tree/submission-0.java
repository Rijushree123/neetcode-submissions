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
    HashMap<TreeNode, Integer> depth;
    int max_depth;
    public int maxDepth(TreeNode root) {
        depth = new HashMap<>();
        max_depth = -1;
        depth.put(null,-1);
        dfs(root, null);
        for(Integer d: depth.values())
            max_depth = Math.max(max_depth, d);
        return max_depth+1;         
    }
    public void dfs(TreeNode node, TreeNode parent){
        if(node!=null){
            depth.put(node, depth.get(parent)+1);
            dfs(node.left, node);
            dfs(node.right, node);
        }
    }
}
