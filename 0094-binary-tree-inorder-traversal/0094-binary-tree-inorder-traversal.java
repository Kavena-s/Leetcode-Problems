
class Solution {
    public void iot(TreeNode root , List<Integer> list){
        if(root == null) return;
        iot(root.left,list);
        list.add(root.val);
        iot(root.right,list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        iot(root, list);
        return list;
    }
}