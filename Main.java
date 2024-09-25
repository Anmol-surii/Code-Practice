
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
        CourseScheduleIII cs = new CourseScheduleIII();

        System.out.println("*****************************************");
        System.out.println("Answer is " + cs.scheduleCourse(new int[][] {{300, 550}, {800, 1300}, {1200, 1600}, {2300, 3800}}));
        System.out.println("*****************************************");
    }
}