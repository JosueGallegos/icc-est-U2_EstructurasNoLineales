package main.Ejercicio_01_Insert;

import main.Materia.Controllers.Models.Node;

public class InsertBSTTest {
    private Node root;

    public InsertBSTTest(int [] values) {
       for (int value : values) {
           root = insert(root, value);
           
       }
    }
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        } 
        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(),value));
        }else if(value > root.getValue()){
            root.setRight(insert(root.getRight(),value));

        }
        return root;
    }
    public void printInOrder() {
        printInOrderRecursive(root);
        System.out.println();
    }
    private void printInOrderRecursive(Node node) {
        if (node != null) {
            printInOrderRecursive(node.getLeft());
            System.out.print(node.getValue() + " ");
            printInOrderRecursive(node.getRight());
        }
    }
}
