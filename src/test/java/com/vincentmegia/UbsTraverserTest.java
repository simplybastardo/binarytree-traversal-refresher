package com.vincentmegia;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class UbsTraverserTest {
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
        var ubsTraverser = new UbsTraverser();
        var list = List.of(6, 9, 22, 30);
        for (int num : list) {
            var output = ubsTraverser.isPresent(num, this.tree);
            System.out.println("output: " + output);
        }

        //expected
        //1,6,7,8,9,10,11,14,20,22
    }
}
