package org.algorithms.baekjoon.silver.tree;

import static org.algorithms.baekjoon.silver.tree.Boj_1991.sb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_1991 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Tree tree = new Tree();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            char a = st.nextToken().charAt(0);
            char b = st.nextToken().charAt(0);
            char c = st.nextToken().charAt(0);
            tree.insert(a, b, c);
        }

        tree.preorder(tree.root);
        sb.append("\n");
        tree.inorder(tree.root);
        sb.append("\n");
        tree.postorder(tree.root);

        System.out.println(sb);
    }
}

class Node {
    char value;
    Node left;
    Node right;

    public Node(char value) {
        this.value = value;
    }
}

class Tree {
    Node root;

    void insert(char thisNode, char left, char right) {
        if (root == null) {
            root = new Node(thisNode);
            if (left != '.') {
                root.left = new Node(left);
            }
            if (right != '.') {
                root.right = new Node(right);
            }
        } else {
            search(root, thisNode, left, right);
        }
    }

    void search(Node root, char thisNode, char left, char right) {
        if (root == null) {
            return;
        }

        if (root.value == thisNode) {
            if (left != '.') {
                root.left = new Node(left);
            }
            if (right != '.') {
                root.right = new Node(right);
            }
        } else {
            search(root.left, thisNode, left, right);
            search(root.right, thisNode, left, right);
        }
    }


    void preorder(Node root) {

        sb.append(root.value);

        if (root.left != null) {
            preorder(root.left);
        }

        if (root.right != null) {
            preorder(root.right);
        }
    }

    void inorder(Node root) {
        if (root.left != null) {
            inorder(root.left);
        }
        sb.append(root.value);
        if (root.right != null) {
            inorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root.left != null) {
            postorder(root.left);
        }
        if (root.right != null) {
            postorder(root.right);
        }
        sb.append(root.value);
    }

}
