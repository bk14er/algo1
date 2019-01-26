package pl.sda.structure.binarytree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTreeTest {

    @Test
    public void binaryTreeBuilder1() {
        //          2
        //         / \
        //        1   3
        TreeNode root = new TreeNode(2);
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);

        root.left = one;
        root.right = three;

    }

    @Test
    public void binaryTreeBuilder2() {
        //TODO zbuduj podaną strukturę ustawiajac odpowiednie zmienne left i right
        /**             6
         *           /    \
         *          4      8
         *        / \    /  \
         *       3   5   7  9
         **/
        TreeNode root  = new TreeNode(6);

        TreeNode four  = new TreeNode(4);
        TreeNode eight  = new TreeNode(8);

        root.left = four;
        root.right = eight;

        TreeNode three  = new TreeNode(3);
        TreeNode five  = new TreeNode(5);

        four.left = three;
        four.right = five;

        TreeNode seven  = new TreeNode(7);
        TreeNode nine  = new TreeNode(9);

        eight.left = seven;
        eight.right = nine;

    }


    /**
     *
     *  Tworzymy drzewo :
     *
     *      5  <- ROOT
     *        |
     *        6
     *          |
     *           7
     */
    @Test
    public void simpleAdd(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(6);
        tree.add(7);
    }

    /**
     *
     *  Tworzymy drzewo :
     *
     *          9   <- ROOT
     *     |         |
     *     5         12
     *    |  |      |  |
     *    4  6    11   13
     */
    @Test
    public void simpleFind(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(9);
        tree.add(12);
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(11);
        tree.add(13);

        int value = tree.find(12);

        assertEquals(12,value);
    }


    /**
     * Test do metod której celem jest znalezienie najmniejszego elementu w drzewie
     *
     *  Tworzymy drzewo :
     *
     *          9     <- ROOT
     *     |         |
     *     5         12
     *    |  |      |  |
     *    4  6    11   13
     *
     *
     *    Jaka jest najmniejsza wartość w tym drzewie?
     */
    @Test
    public void findSmallestValue(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(9);
        tree.add(12);
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(11);
        tree.add(13);

        int value = tree.findSmallestValue();

        assertEquals(4,value);
    }

    /**
     *
     *  Tworzymy drzewo :
     *
     *          9   <- ROOT
     *     |         |
     *     5         12
     *    |  |      |  |
     *    4  6    11   13
     */
    @Test
    public void delete(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(9);
        tree.add(12);
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(11);
        tree.add(13);

        tree.delete(12);

        int deleted = tree.find(12);

        assertEquals(-1,deleted);
    }

    /**
     * Przeszukiwanie w głąb dzielimy na
     *
     *                6 <-ROOT
     *             4     8
     *           3  5  7   9
     *
     *  in-order  - odwiedzamy lewe podrzewo , roota i na koncu prawe podrzewo
     *
     *  pre-order - odwiedzi roota, potem lewe podrzewo i na koncu prawe podrzewo
     *
     *  post-order - odwiedzi lewe podrzewo, prawe podrzewo i na koniec roota
     *
     */
    @Test
    public void depthFirstSearch(){

        BinarySearchTree tree = new BinarySearchTree();

        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);

        //Wyswietli 3 4 5 6 7 8 9
        tree.traverseInOrder();
        System.out.println();

        //Wyswietli  6 4 3 5 8 7 9
        tree.traversePreOrder();
        System.out.println();

        //Wyswietli 3 5 4 7 9 8 6
        tree.traversePostOrder();
    }

}