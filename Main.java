
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
        SingleThreadedCPU cpu = new SingleThreadedCPU();

        System.out.println("*****************************************");
        for(int x : cpu.getOrder(new int[][] {{1,2},{2,4},{3,2},{4,1}})) {
            System.out.println(x + " ");
        }
        System.out.println("*****************************************");
    }
}