package com.vincentmegia;

/**
 * Left, Right Node
 */
public class PostOrderTraverser {
    private Node tree;

    public PostOrderTraverser(Node node) {
        this.tree = node;
    }

    public void traverse() {
        traverse(this.tree);
    }

    public void traverse(Node node) {
        if (node.getLeftNode() != null) {
            traverse(node.getLeftNode());
        }
        if (node.getRightNode() != null) {
            traverse(node.getRightNode());
        }
        System.out.println(node.getValue());
    }
}
