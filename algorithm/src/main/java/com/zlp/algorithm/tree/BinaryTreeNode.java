package com.zlp.algorithm.tree;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author zhanzhan
 * @version 1.0.0
 * @date 2018/3/4
 */
@Data
@Accessors(chain = true)
public class BinaryTreeNode {
  public int value;
  public BinaryTreeNode left;
  public BinaryTreeNode right;
}
