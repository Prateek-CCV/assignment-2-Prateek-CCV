/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree

import problem1.node.TreeNode;

public class MyBinarySearchTree {
    public TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.getLeftNode());
        System.out.println(node.getData());
    }

    public void printInorder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.getLeftNode());
        System.out.println("The  node" + node.getData());
        printInOrder(node.getRightNode());
    }

    void printInorder() {
        printInOrder(root);
    }
}
