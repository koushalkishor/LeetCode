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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root=helper(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
        return root;
    }
    public static TreeNode helper(int[] pre, int[] in,int sipre,int eipre,int siIn,int eiIn){
        if(sipre>eipre){
            return null;
        }
        int rootdata=pre[sipre];
        TreeNode root=new TreeNode(rootdata);
        int rootIndex=-1;
        for(int i=siIn;i<=eiIn;i++){
            if(in[i]==rootdata){
                rootIndex=i;
                break;
            }
        }

        int siPreLeft=sipre+1;
        int siInLeft=siIn;
        int eiInLeft=rootIndex-1;
        int siInRight=rootIndex+1;
        int eiPreRight=eipre    ;
        int eiInRight=eiIn;
        int lengthLefttree=eiInLeft-siInLeft+1;

        int eiPreLeft=siPreLeft+lengthLefttree-1;
        int siPreRight=eiPreLeft+1;
        TreeNode rootLeft=helper(pre,in,siPreLeft,eiPreLeft,siInLeft,eiInLeft);
        TreeNode rootRight=helper(pre,in,siPreRight,eiPreRight,siInRight,eiInRight);
        root.left=rootLeft;
        root.right=rootRight;
        return root;
    }
}