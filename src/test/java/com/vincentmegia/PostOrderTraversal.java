package com.vincentmegia;

import org.junit.Before;
import org.junit.Test;

public class PostOrderTraversal {
    private Node tree;

    @Before
    public void setUp() {
        this.tree = new Node(10);
        this.tree.insert(7);
        this.tree.insert(11);
        this.tree.insert(6);
        this.tree.insert(8);
        this.tree.insert(20);
        this.tree.insert(1);
        this.tree.insert(9);
        this.tree.insert(14);
        this.tree.insert(22);
    }

    @Test
    public void testTraverse() {
        var postOrderTraverser = new PostOrderTraverser(this.tree);
        postOrderTraverser.traverse();

        //expected
        //1,6,9,8,7,14,22,20,11,10
    }
}
