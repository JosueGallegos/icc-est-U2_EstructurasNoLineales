package main.Ejercicio_03_listLeves;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import main.Materia.Controllers.Models.Node;

public class ListLeves {
    public List<List<Node>> listLeves(Node root){
        List<List<Node>> result = new ArrayList<>();

        if (root != null) {
           

            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                List<Node> levelList = new ArrayList<>();

                for (int i = 0; i < levelSize; i++) {
                    Node node = queue.poll();
                    levelList.add(node);

                    if (node.getLeft() != null) {
                        queue.offer(node.getLeft());
                    }

                    if (node.getRight() != null) {
                        queue.offer(node.getRight());
                    }

                    result.add(levelList);
                }

            }
            
        }
        return result;
    }
   
    
}
