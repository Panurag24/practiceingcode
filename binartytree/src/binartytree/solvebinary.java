package binartytree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val1, TreeNode left1, TreeNode right1) {
        this.val = val1;
        this.left = left1;
        this.right = right1;
    }

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }
}

public class solvebinary {

    public int maxdepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.min(maxdepth(root.left), maxdepth(root.right));
    }

    public static void main(String[] args) {
        solvebinary solver = new solvebinary();

        // Sample Binary Tree:
        //
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5
        //
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(3,node6,node6);
        TreeNode root = new TreeNode(1, node2, node3);

        int depth = solver.maxdepth(root);
        System.out.println("Max Depth of the Binary Tree: " + depth);
    }
}
