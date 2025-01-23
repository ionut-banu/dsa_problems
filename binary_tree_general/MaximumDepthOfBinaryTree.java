package binary_tree_general;

class MaximumDepthOfBinaryTree {

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

    class Solution {
        public int maxDepth(TreeNode root) {
            return maxDepth(root, 0);
        }

        private int maxDepth(TreeNode node, int maxDepth) {
            if (node == null) {
                return maxDepth;
            }
            if (node.right == null && node.left == null) {
                return maxDepth + 1;
            }
            return Math.max(maxDepth(node.right, maxDepth + 1), maxDepth(node.left, maxDepth + 1));
        }
    }
}
