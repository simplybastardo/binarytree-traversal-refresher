package com.vincentmegia;

public class UbsTraverser {

    public int isPresent(int value, Node node) {
        int output = 0;
        if (node == null) return 0;
        if (value == node.getValue()) output = 1;
        else if (value < node.getValue()) {
            //left node
            output = isPresent(value, node.getLeftNode());
        } else {
            //right node
            output = isPresent(value, node.getRightNode());
        }
        return output;
    }
}
