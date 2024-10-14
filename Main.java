
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
        // ValidIPAddress p = new ValidIPAddress();

        // System.out.println("*****************************************");
        // System.out.println("Ans: " + p.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));

        String str = "2001:0db8:85a3:0:0:8A2E:0370:7334:";
        
        // Split the string by colon
        String[] parts = str.split("\\:", -1);
        
        // Print the size of the result array
        System.out.println("Size of array: " + parts.length);
    }
}