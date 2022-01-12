import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FindLeavesOfBinaryTreeTest {

    private FindLeavesOfBinaryTree solution;

    @BeforeEach
    public void before(){
        solution = new FindLeavesOfBinaryTree();
    }

    @Test
    public void walkTest(){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(8);
        root.right = new TreeNode(3);

        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(new Integer[]{8, 3}));
        result.add(List.of(new Integer[]{4}));
        result.add(List.of(new Integer[]{2}));
        result.add(List.of(new Integer[]{1}));

        Assertions.assertEquals(result, solution.findLeaves(root));
    }
}
