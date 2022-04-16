
import org.junit.Assert;
import org.junit.Test;

public class AVLTreeTest {



    @Test
    public void Insertion_Check() {
        AVLTree tree = SampleAVLTree();
        int newKey = 11;
        tree.insert(newKey);
        Assert.assertTrue(isAVL(tree));
    }
    @Test
    public void Insertion_Check2() {
        AVLTree tree = SampleAVLTree();
        int newKey = 12;
        tree.insert(newKey);
        Assert.assertTrue(isAVL(tree));
    }

    @Test
    public void Deletion_check() {
        AVLTree tree = SampleAVLTree();
        tree.delete(1);
        Assert.assertTrue(isAVL(tree, tree.getRoot()));
    }

    private boolean isAVL(AVLTree tree) {
        return isAVL(tree, tree.getRoot());
    }

    private boolean isAVL(AVLTree tree, AVLTree.Node node) {
        if ( node == null )
            return true;
        int balance = tree.getBalance(node);
        return (balance <= 1 && balance >= -1) && isAVL(tree, node.left) && isAVL(tree, node.right);
    }

    private AVLTree SampleAVLTree() {
        AVLTree avlTree = new AVLTree();
        for (int i = 0; i < 10; i++)
            avlTree.insert(i);
        return avlTree;
    }
}