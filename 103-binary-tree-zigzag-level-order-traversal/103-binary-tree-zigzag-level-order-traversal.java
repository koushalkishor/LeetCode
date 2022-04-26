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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> lst = new ArrayList<>();
        levelOrder(lst, root, 0);
        return lst;
    }
    public void levelOrder(List<List<Integer>> lst, TreeNode root, int level) {
        if(root == null) {
            return;
        } 
        if(lst.size() == level) {
            List<Integer> newLevel = new LinkedList<>();
            lst.add(newLevel);
        }
        if(level % 2 == 0) {
            lst.get(level).add(root.val);
        } else {
            lst.get(level).add(0, root.val);
        }
        levelOrder(lst, root.left, level + 1);
        levelOrder(lst, root.right, level + 1);
    }
    
}