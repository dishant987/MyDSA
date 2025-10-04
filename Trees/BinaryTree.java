import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    private TreeNode root = null;

    public BinaryTree(int value) {
        root = new TreeNode(value);
        root.leftNode = null;
        root.rightNode = null;
    }

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        }

        TreeNode cuNode = root;
        while (true) {
            if (cuNode.data >= value) { // left
                if (cuNode.leftNode == null) {
                    cuNode.leftNode = new TreeNode(value);
                    break;
                }

                cuNode = cuNode.leftNode;
            } else { // right
                if (cuNode.rightNode == null) {
                    cuNode.rightNode = new TreeNode(value);
                    break;
                }

                cuNode = cuNode.rightNode;
            }
        }
    }

    public void insertRecursive(int value) {
        insert(root, value);
    }

    private TreeNode insert(TreeNode node, int value) {
        if (node == null) {
            node = new TreeNode(value);
            return node;
        }

        if (node.data >= value) {
            node.leftNode = insert(node.leftNode, value);
        } else {
            node.rightNode = insert(node.rightNode, value);
        }
        return node;
    }

    public int findElement(int value) {

        TreeNode cuNode = root;
        if (cuNode == null) {
            throw new java.util.NoSuchElementException("Element not found in the tree");
        }
        if (cuNode.data == value) {
            return cuNode.data;
        }
        while (cuNode != null) {
            if (cuNode.data > value) {
                cuNode = cuNode.leftNode;
            } else {
                cuNode = cuNode.rightNode;
            }
        }
        throw new java.util.NoSuchElementException("Element not found in the tree");

    }

    public int size() {
        return size(root);
    }

    private int size(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.leftNode) + size(root.rightNode);
    }

    public void preOrderTraversal() { // root -> left -> right
        preOrderTraversal(root);
    }

    private void preOrderTraversal(TreeNode node) { // root -> left -> right
        if (node == null) {
            return;
        }

        System.out.println(node.data);
        preOrderTraversal(node.leftNode);
        preOrderTraversal(node.rightNode);
    }

    public void inOrderTraversal() { // left -> root -> right
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode node) { // left -> root -> right
        if (node == null) {
            return;
        }
        inOrderTraversal(node.leftNode);
        System.out.println(node.data);
        inOrderTraversal(node.rightNode);
    }

    public void postOrderTraversal() { // left -> right -> root
        postOrderTraversal(root);
    }

    private void postOrderTraversal(TreeNode node) { // left -> right -> root
        if (node == null) {
            return;
        }
        postOrderTraversal(node.leftNode);
        postOrderTraversal(node.rightNode);
        System.out.println(node.data);
    }

    private TreeNode getMin(TreeNode root) {
        if (root == null)
            return null;

        if (root.leftNode == null)
            return root;

        return getMin(root.leftNode);
    }

    public TreeNode getMin() {
        return getMin(root);
    }

    private boolean isEqual(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }

        if (t1 == null || t2 == null)
            return false;
        return t1.data == t2.data && isEqual(t1.leftNode, t2.leftNode) && isEqual(t1.rightNode, t2.rightNode);
    }

    public boolean isEqual(BinaryTree bt) {
        if (bt == null)
            return false;
        return isEqual(this.root, bt.root);
    }

    public void getKNodeDistance(TreeNode root, int k) {
        if (root == null)
            return;
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        getKNodeDistance(root.leftNode, k - 1);
        getKNodeDistance(root.rightNode, k - 1);
    }

    public void getKNodeDistance(int distance) {
        getKNodeDistance(root, distance);
    }

    public int getDepth(int value) {
        return getDepth(root, value, 0);
    }

    private int getDepth(TreeNode node, int value, int depth) {
        if (node == null)
            return -1;
        if (node.data == value)
            return depth;

        int left = getDepth(node.leftNode, value, depth + 1);
        if (left != -1)
            return left;

        return getDepth(node.leftNode, value, depth + 1);
    }

    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }
        levelOrderTraversal(root);
    }

    private void levelOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();

            System.out.println(currNode.data + " ");
            if (currNode.leftNode != null) {
                queue.add(currNode.leftNode);
            }
            if (currNode.rightNode != null) {
                queue.add(currNode.rightNode);
            }
        }
    }

    public List<List<Integer>> levelOrderTraversalList() {
        if (root == null) {
            return Collections.emptyList();
        }
        return levelOrderTraversalList(root);
    }

    private List<List<Integer>> levelOrderTraversalList(TreeNode node) {
        if (node == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();
                currentLevel.add(currNode.data);
                if (currNode.leftNode != null) {
                    queue.add(currNode.leftNode);
                }
                if (currNode.rightNode != null) {
                    queue.add(currNode.rightNode);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }

    int diameter = 0;

    public int height(TreeNode root) {
        if (root == null)
            return 0;

        int leftHeight = height(root.leftNode);
        int rightHeight = height(root.rightNode);

        // Update diameter: longest path through this node
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Height of current node
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int getDiameter() {
        height(root);
        return diameter;
    }

    @Override
    public String toString() {
        return treeToString(root);
    }

    private String treeToString(TreeNode node) {
        if (node == null) {
            return "null";
        }
        return node.data + " (" + treeToString(node.leftNode) + ", " + treeToString(node.rightNode) + ")";
    }

}
