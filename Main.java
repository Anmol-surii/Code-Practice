import LLD.StrategyDesign.NormalVehicle;
import LLD.StrategyDesign.SportsVehicle;
import LLD.StrategyDesign.Vehicle;

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
        Vehicle vh1 = new SportsVehicle();
        vh1.drive();

        Vehicle vh2 = new NormalVehicle();
        vh2.drive();
    }
}