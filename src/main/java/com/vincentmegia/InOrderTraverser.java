package com.vincentmegia;

/**
 * Left Node Right
 *
 */
public class InOrderTraverser {

    private Node tree;

    public InOrderTraverser(Node tree) {
        this.tree = tree;
    }

    public void traverse() {
        traverse(tree);
    }

    public void traverse(Node node) {
        if (node.getLeftNode() != null) {
            traverse(node.getLeftNode());
        }
        System.out.println(node.getValue());
        if (node.getRightNode() != null) {
            traverse(node.getRightNode());
        }
    }
}
