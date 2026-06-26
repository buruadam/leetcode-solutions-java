package easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaximumDepthOfBinaryTree {
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // 1. Recursive Depth-First Search
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    // 2. Iterative Depth-First Search
    public int maxDepthIterativeDFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> depthStack = new Stack<>();

        nodeStack.push(root);
        depthStack.push(1);
        int maxDepth = 0;

        while (!nodeStack.isEmpty()) {
            TreeNode currentNode = nodeStack.pop();
            int currentDepth = depthStack.pop();

            if (currentNode != null) {
                maxDepth = Math.max(maxDepth, currentDepth);

                if (currentNode.right != null) {
                    nodeStack.push(currentNode.right);
                    depthStack.push(currentDepth + 1);
                }

                if (currentNode.left != null) {
                    nodeStack.push(currentNode.left);
                    depthStack.push(currentDepth + 1);
                }
            }
        }
        return maxDepth;
    }

    // 3. Iterative Breadth-First Search
    public int maxDepthIterativeBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            depth++;

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                if (currentNode != null) {
                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }

                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
            }
        }
        return depth;
    }
}
