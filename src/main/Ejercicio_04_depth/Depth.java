package main.Ejercicio_04_depth;

import main.Materia.Controllers.Models.Node;

public class Depth {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int depthLeft = maxDepth(root.getLeft());    
        int depthRight = maxDepth(root.getRight());
        return Math.max(depthLeft, depthRight) + 1;
    }

    public Node insertar(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.getValue()) {
            root.setLeft(insertar(root.getLeft(), value));
        } else {
            root.setRight(insertar(root.getRight(), value));
        }
        return root;
    }

    public void imprimir(Node node) {
        if (node != null) {
            imprimir(node.getLeft());
            System.out.print(node.getValue() + " ");
            imprimir(node.getRight());
        }
    }
    
}
