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
   public boolean isBalanced(TreeNode root) {
        //one approach
        if(root==null){
            return true;
        }
        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);
        boolean sb=Math.abs(ht(root.left)-ht(root.right))<=1;
        
        return left&&right&&sb;
    }
    public int ht(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=ht(root.left);
        int rh=ht(root.right);
        return Math.max(lh,rh)+1;
    }
   }
    
