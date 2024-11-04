import LLD.DesignPatterns.FactoryDesignPattern.OS;
import LLD.DesignPatterns.FactoryDesignPattern.OSFactory;

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
        OSFactory osFactory = new OSFactory();
        OS os1 = osFactory.getInstance("open");
        os1.spec();

        OS os2 = osFactory.getInstance("closed");
        os2.spec();

        OS os3 = osFactory.getInstance("hello world");
        os3.spec();
    }
}