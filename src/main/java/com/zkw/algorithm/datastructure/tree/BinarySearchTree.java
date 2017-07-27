package com.zkw.algorithm.datastructure.tree;

/**
 * 二叉查找树实现
 *
 * @author James
 * @create 2017-07-19 上午 9:28
 **/

public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {
    private static class BinaryNode<AnyType> {
        AnyType element;//the data in the node
        BinaryNode<AnyType> left;//left child
        BinaryNode<AnyType> right;//right child

        BinaryNode(AnyType theElement) {
            this(theElement, null, null);
        }

        BinaryNode(AnyType theElement, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt) {
            element = theElement;
            lt = left;
            rt = right;
        }
    }

    private BinaryNode<AnyType> root;

    public BinarySearchTree() {
        root = null;
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(AnyType x) {
        return contains(x, root);
    }

    public AnyType findMin() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException();
        return findMin(root).element;
    }

    public AnyType findMax() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException();
        return findMax(root).element;
    }

    public void insert(AnyType x) {
        root = insert(x, root);
    }

    public void remove(AnyType x) {
        root = remove(x, root);
    }

    /**
     * Internal method to find an item in a subtree
     *
     * @return node containing the matched item
     * @Param x is item to search for
     * @Param t the node that roots the subtree
     */
    private boolean contains(AnyType x, BinaryNode<AnyType> t) {
        if (t == null)
            return false;
        int compareResult = x.compareTo(t.element);
        if (compareResult < 0)
            return contains(x, t.left);
        else if (compareResult > 0)
            return contains(x, t.right);
        else
            return true;//match
    }

    /**
     * 递归方式
     * Internal method to find the smallest item in a subtree
     *
     * @return node containing the smallest item.
     * @Param t the node that roots the subtree
     */
    private BinaryNode<AnyType> findMin(BinaryNode<AnyType> t) {
        if (t == null)
            return null;
        else if (t.left == null)
            return t;
        return findMin(t.left);
    }

    /**
     * 非递归方式 实现查找最大值
     */
    private BinaryNode<AnyType> findMax(BinaryNode<AnyType> t) {
        if (t != null)
            while (t.right != null)
                t = t.right;
        return t;
    }

    /**
     * Internal method to insert into subtree
     *
     * @return the new root of the subtree
     * @Param x the item to insert
     * @Param t the node that roots the subtree
     */
    private BinaryNode<AnyType> insert(AnyType x, BinaryNode<AnyType> t) {
        if (t == null)
            return new BinaryNode<AnyType>(x, null, null);
        int compareResult = x.compareTo(t.element);
        if (compareResult < 0)
            t.left = insert(x, t.left);
        if (compareResult > 0)
            t.right = insert(x, t.right);
        else
            ;//Duplicat do nothing
        return t;
    }

    /**
     * Internal method to remove from a subtree
     *
     * @return the new root of the subtree
     * @Param x the item to remove
     * @Param t the node that roots the subtree
     */
    private BinaryNode<AnyType> remove(AnyType x, BinaryNode<AnyType> t) {
        if (t == null)
            return t;//Item not found;do nothing
        int compareResult = x.compareTo(t.element);
        if (compareResult < 0)
            t.left = remove(x, t.left);
        else if (compareResult > 0)
            t.right = remove(x, t.right);
        else if (t.left != null && t.right != null) {//two children
            t.element = findMin(t.right).element;
            t.right = remove(t.element, t.right);
        } else
            t = t.left != null ? t.left : t.right;
        return t;
    }

    private void printTree(BinaryNode<AnyType> t) {

    }


}
