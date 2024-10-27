class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        TreeNode tempNode = root;
        // we have root node which has left and right
        // say root node is 1 and left and right are 2 and 3 respectively.
        if (root == null) {
            return root;
        }

        tempNode.left = root.right;
        tempNode.right = root.left;

        swapLeft(tempNode.left);
        swapRight(tempNode.right);

        return tempNode;
    }

    public TreeNode swapLeft(TreeNode leftRoot) {
        TreeNode node = leftRoot;
        if (node.left == null || node.right == null) {
            return node;
        }
        node.left = leftRoot.right;
        node.right = leftRoot.left;
        return swapLeft(node.left);
    }

    public TreeNode swapRight(TreeNode leftRoot) {
        TreeNode node = new TreeNode();

        if (node.left == null || node.right == null) {
            return node;
        }
        node.left = leftRoot.right;
        node.right = leftRoot.left;
        return swapRight(node.right);
    }
}
