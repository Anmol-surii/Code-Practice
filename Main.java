
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Main {
    public static void main(String[] args) {
        EqualRowColumnPairs p = new EqualRowColumnPairs();

        System.out.println("*****************************************");
        System.out.println("Ans: " + p.equalPairs(new int[][]{{3, 2, 1},{1, 7, 6},{2, 7, 7}}));
    }
}