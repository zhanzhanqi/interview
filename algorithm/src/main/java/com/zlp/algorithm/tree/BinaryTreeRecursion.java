package com.zlp.algorithm.tree;

/**
 *
 * 二叉树遍历算法
 *
 * @author zhanzhan
 * @version 1.0.0
 * @date 2018/3/4
 */
public class BinaryTreeRecursion {

  /**
   * 先序遍历: 根，左，右
   * @param head
   */
  public void preOrderRecur(BinaryTreeNode head){
    if (null == head){
      return;
    }
    System.out.print(head.value + " ");
    preOrderRecur(head.left);
    preOrderRecur(head.right);
  }

  /**
   * 中序遍历：左，跟，右
   * @param head
   */
  public void inOrderRecur(BinaryTreeNode head){
    if (null == head){
      return;
    }

    inOrderRecur(head.left);
    System.out.print(head.value + " ");
    inOrderRecur(head.right);
  }

  /**
   * 后续遍历: 左，右，跟
   * @param head
   */
  public void postOrderRecur(BinaryTreeNode head){
    if (null == head){
      return;
    }
    postOrderRecur(head.left);
    postOrderRecur(head.right);
    System.out.print(head.value + " ");
  }
}
