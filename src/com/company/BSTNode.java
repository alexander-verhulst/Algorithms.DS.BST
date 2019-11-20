package com.company;

public class BSTNode {

    BSTNode left, right;
    int data;

    public BSTNode() {
        left = null;
        right = null;
        data = 0;
    }

    public BSTNode (int n) {
        left = null;
        right = null;
        data = n;
    }

    //set left node
    public void setLeft(BSTNode n) {
        left = n;
    }

    //set right node
    public void setRight(BSTNode n) {
        right = n;
    }

    //retrieve left node
    public BSTNode getLeft() {
        return left;
    }

    //retrieve right node
    public BSTNode getRight() {
        return right;
    }

    //set data to node
    public void setData(int d) {
        data = d;
    }

    //retrieve data from node
    public int getData () {
        return data;
    }


}
