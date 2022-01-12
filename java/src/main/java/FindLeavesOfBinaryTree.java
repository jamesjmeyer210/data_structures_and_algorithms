import java.util.ArrayList;
import java.util.List;

public class FindLeavesOfBinaryTree {

    private List<List<Integer>> leaves = new ArrayList<>();

    public List<List<Integer>> findLeaves(TreeNode root) {
        while (root != null){
            List<Integer> leaves = new ArrayList<>();
            root = walk(root, leaves);
            this.leaves.add(leaves);
        }
        return this.leaves;
    }

    private TreeNode walk(TreeNode node, List<Integer> leaves){
        if(node.left == null && node.right == null){
            leaves.add(node.val);
            return null;
        }

        if(node.left != null){
            node.left = walk(node.left, leaves);
        }
        if(node.right != null){
            node.right = walk(node.right, leaves);
        }
        return node;
    }
}
