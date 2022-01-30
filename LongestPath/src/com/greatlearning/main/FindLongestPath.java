package com.greatlearning.main;

import java.util.ArrayList;

public class FindLongestPath {

    static class Node {
        Node left;
        Node right;
        int data;
    }

    static Node newNode (int data) {
        Node tempNode = new Node();
        tempNode.data = data;
        tempNode.left = null;
        tempNode.right = null;

        return tempNode;
    }

    public static ArrayList<Integer> findLongestPath(Node root) {

        if (root == null) {
            ArrayList<Integer> end = new ArrayList<>();
            return end;
        }

        ArrayList<Integer> rightList = findLongestPath(root.right);

        ArrayList<Integer> leftList = findLongestPath(root.left);

        if (rightList.size() < leftList.size()) {
            leftList.add(root.data);
        } else {
            rightList.add(root.data);
        }

        return (leftList.size() > rightList.size() ? leftList : rightList);
    }


    public static void main(String[] args) {

        Node root = newNode(100);
        root.left = newNode(20);
        root.right = newNode(130);
        root.left.left = newNode(10);
        root.left.right = newNode(50);
        root.right.left = newNode(110);
        root.right.right = newNode(140);
        root.left.left.left = newNode(5);

        ArrayList<Integer> result = findLongestPath(root);
        int size = result.size();

        for (int i = size - 1; i > 0; i--) {
            System.out.print(result.get(i) + " --> ");
        }
        System.out.println(result.get(0));
    }

}
