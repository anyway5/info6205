package MidTerm;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val; this.left = left; this.right = right;
    }
}

public class Solution2 {
    public void printPerimeter(TreeNode root){
        if (root == null){
            System.out.print(root.val + " ");
            return;
        }
        printRight(root.right);
/*        printLeaves(root.right);
        printLeaves(root.left);
        printLeft(root.left);*/
    }

    public void printLeaves(TreeNode node) {
        if (node == null)
            return;
        printLeaves(node.right);
        if (node.left == null && node.right == null)
            System.out.print(node.val + " ");
        printLeaves(node.left);
    }

    public void printRight(TreeNode node) {
        if (node == null)
            return;
        if (node.right != null) {
            printRight(node.right);
            System.out.print(node.val + " ");
        }else if (node.left != null) {
            printRight(node.left);
            System.out.print(node.val + " ");
        }
    }

    public void printLeft(TreeNode node) {
        if (node == null)
            return;

        if (node.left != null) {
            System.out.print(node.val + " ");
            printLeft(node.left);
        }else if (node.right != null) {
        System.out.print(node.val + " ");
        printLeft(node.right);
        }
    }
}


