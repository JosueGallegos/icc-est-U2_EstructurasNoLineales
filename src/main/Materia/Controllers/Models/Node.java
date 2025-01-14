package main.Materia.Controllers.Models;

public class Node {
    private int value;
    private Node left;
    private Node right;
    private int height;

    public Node(int value){
        this.value = value;
       

    }
    

    public void setValue(int value) {
        this.value = value;
    }


    public void setLeft(Node left) {
        this.left = left;
    }


    public void setRight(Node right) {
        this.right = right;
    }


    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }


    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }
    
    


    
}
