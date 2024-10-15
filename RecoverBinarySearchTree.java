public class RecoverBinarySearchTree {
    TreeNode first = null, second = null, prev = null;

    public void recoverTree(TreeNode root) {
        // Inorder traversal to find swapped nodes
        inorderFunction(root);

        // Handles the condition, where only swap if two nodes are found during traversal
        if (first != null && second != null) {
            int val = first.val;
            first.val = second.val;
            second.val = val;
        }
    }

    void inorderFunction(TreeNode root) {
        if (root == null)
            return;

        inorderFunction(root.left);
        // If prev is already set, and voilation occurs
        if (prev != null && root.val < prev.val) {
            // Set first node value to prev, only at first voilation
            if (first == null) {
                first = prev;
            }
            // Set second node value to root, when second voilation occurs
            second = root;
        }
        prev = root;

        inorderFunction(root.right);
    }
}
