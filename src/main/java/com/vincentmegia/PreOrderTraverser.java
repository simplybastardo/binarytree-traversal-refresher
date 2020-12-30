package com.vincentmegia;

/**
 * PreOrder TraverSal means Node Left Right
 */
public class PreOrderTraverser {
    private Node node;

    public PreOrderTraverser(Node node) {
        this.node = node;
    }

    public void traverse() {
        traverse(node);
    }

    public void traverse(Node node) {
        System.out.println(node.getValue());
        if (node.getLeftNode() != null) {
            traverse(node.getLeftNode());
        }
        if (node.getRightNode() != null) {
            traverse(node.getRightNode());
        }
    }
}
