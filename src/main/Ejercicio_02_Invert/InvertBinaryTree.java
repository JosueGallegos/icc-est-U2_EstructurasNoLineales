package main.Ejercicio_02_Invert;

import main.Materia.Controllers.Models.Node;

public class InvertBinaryTree {
    private Node root;

    
    public InvertBinaryTree(int[] values) {
        for (int value : values) {
            root = insert(root, value);
        }
    }

    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));
        }

        return root;
    }

    public void invertTree(){

        root = invertTreeRecursive(root);

    }
    
    private Node invertTreeRecursive(Node root) {
        if (root == null) {
            return null;
        }
        Node temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

        invertTreeRecursive(root.getLeft());
        invertTreeRecursive(root.getRight());

        return root;
    }
    public void imprimir() {
        imprimirInOrder(root);
    }

    private void imprimirInOrder(Node node) {
        if (node != null) {
            imprimirInOrder(node.getLeft());
            System.out.print(node.getValue() + " ");
            imprimirInOrder(node.getRight());
        }
    }

    
}
