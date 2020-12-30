package com.vincentmegia;

public class Node {
    private int value;
    private Node leftNode;
    private Node rightNode;

    public Node(int value) {
        this.value = value;
    }

    public void insert(int value) {
        insert(value, this);
    }

    public void insert(int value, Node node) {
        if (value < node.value) {
            //left node
            if (node.getLeftNode() == null) {
                node.setLeftNode(new Node(value));
            } else {
                insert(value, node.getLeftNode());
            }
        } else {
            //right node
            if (node.getRightNode() == null) {
                node.setRightNode(new Node(value));
            } else {
                insert(value, node.getRightNode());
            }
        }
    }

    public int getValue() { return this.value; }
    public Node getLeftNode() { return this.leftNode; }
    public void setLeftNode(Node node) { this.leftNode = node;}
    public Node getRightNode() { return this.rightNode; }
    public void setRightNode(Node node) { this.rightNode = node; }
}
