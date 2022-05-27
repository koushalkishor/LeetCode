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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int option1=diameterOfBinaryTree(root.left);
        int option2=diameterOfBinaryTree(root.right);
        int option3=height(root.left)+height(root.right);
        int ans=Math.max(option1,Math.max(option2,option3));
        return ans;
    }
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftS=height(root.left);
        int rightS=height(root.right);
        int ans=Math.max(leftS,rightS)+1;
        return ans;
    }
}