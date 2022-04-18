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
    public int sumNumbers(TreeNode root) {
        return SN(root,0);
    }
    private int SN(TreeNode root, int curr){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return curr*10+root.val;
        }
        int left=SN(root.left,curr*10+root.val);
         int right=SN(root.right,curr*10+root.val);
        return left+right;
    }
}