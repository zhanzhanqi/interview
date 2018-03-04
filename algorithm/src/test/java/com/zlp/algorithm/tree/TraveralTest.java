package com.zlp.algorithm.tree;

import org.junit.Before;
import org.junit.Test;

/**
 * @author zhanzhan
 * @version 1.0.0
 * @date 2018/3/4
 */

public class TraveralTest {

  private BinaryTreeNode head;

  @Before
  public void initBinaryTree(){
    BinaryTreeNode node1 = new BinaryTreeNode().setValue(1);
    BinaryTreeNode node2 = new BinaryTreeNode().setValue(2);
    BinaryTreeNode node3 = new BinaryTreeNode().setValue(3);
    BinaryTreeNode node4 = new BinaryTreeNode().setValue(4);
    BinaryTreeNode node5 = new BinaryTreeNode().setValue(5);
    BinaryTreeNode node6 = new BinaryTreeNode().setValue(6);

    node1.left = node2;
    node1.right = node3;
    node2.right = node4;
    node3.left = node5;
    node5.right = node6;

    head = node1;
  }

  @Test
  public void preOrderBinaryTreeTest(){
    // should be 1 2 4 3 5 6
    new BinaryTreeRecursion().preOrderRecur(head);
  }

  @Test
  public void inOrderBinaryTreeTest(){
    // should 2 4 1 5 6 3
    new BinaryTreeRecursion().inOrderRecur(head);
  }

  @Test
  public void postOrderBinaryTreeTest(){
    // should be 4 2 6 5 3 1
    new BinaryTreeRecursion().postOrderRecur(head);
  }
}
