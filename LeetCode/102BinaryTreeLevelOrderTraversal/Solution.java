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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q1=new LinkedList<TreeNode>();
        List<List<Integer>> ans= new LinkedList<List<Integer>>();

        if(root==null) return ans;

        q1.offer(root);

        while(!q1.isEmpty()){
            int levelNum=q1.size();
            List<Integer> subList=new LinkedList<Integer>();

            for(int i=0;i< levelNum;i++){
                if(q1.peek().left!=null) q1.add(q1.peek().left);
                if(q1.peek().right!=null) q1.add(q1.peek().right);
                subList.add(q1.remove().val);
            }
            ans.add(subList);
        }
    return ans;
    }
}