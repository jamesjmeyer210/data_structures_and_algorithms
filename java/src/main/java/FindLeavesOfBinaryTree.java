import java.util.ArrayList;
import java.util.List;

public class FindLeavesOfBinaryTree {

    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> allLeaves = new ArrayList<>();
        while (root != null){
            List<Integer> leaves = new ArrayList<>();
            root = walk(root, leaves);
            allLeaves.add(leaves);
        }
        return allLeaves;
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
