
import java.util.List;
import main.Ejercicio_03_listLeves.ListLeves;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Controllers.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //runArbolBinario();
        //runEjecicio3();
        runArbolAVL();
       

    }

    public static void runEjecicio3(){
        ArbolBinario arbol = new ArbolBinario();
        ListLeves levels = new ListLeves();
        int[] valores = {1,2,3,4,6,7,9};
          for(int i = 0; i < valores.length; i++){
               arbol.insert(valores[i]);
         }
         arbol.printTree();
         List<List<Node>> lista = levels.listLeves(arbol.getRoot());

         System.out.println("Listas de niveles");
         for (int i = 0; i < lista.size(); i++) {
             System.out.print("Nivel " + i + " : ");
             for (Node node : lista.get(i)) {
                 System.out.print(node.getValue() + " ");
             }
             System.out.println();
             
         }


       
    }
       
            
    public static void runArbolBinario(){
        ArbolBinario arbol = new ArbolBinario();
        ArbolRecorridos recorridos = new ArbolRecorridos();
        int [] valores = {40, 20, 60, 10, 30 ,50, 70, 5, 15, 55};

        for(int value : valores){
            arbol.insert(value);


        }

        arbol.printTree();

        System.out.println("Recorrido PreOrden");
        recorridos.preOrderRecursivo(arbol.getRoot());
        System.out.println("\nRecorrido PosOrden");
        recorridos.posOrdenRecursivo(arbol.getRoot());
        System.out.println("\nRecorrido InOrden");
        recorridos.inOrdenRecursivo(arbol.getRoot());

    }
    public static void runArbolAVL(){
        //ArbolBinario arbol = new ArbolBinario();
        ArbolAVL avl = new ArbolAVL();
        int[] valores = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };

        

        for (int value : valores) {
            avl.insert(value);
        }
        

        

    }

}
