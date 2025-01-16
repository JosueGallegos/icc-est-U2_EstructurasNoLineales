
import java.util.List;
import main.Ejercicio_01_Insert.InsertBSTTest;
import main.Ejercicio_02_Invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLeves;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Controllers.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //runArbolBinario();
        //runArbolAVL();
        runEjercicio1();
        runEjercicio2();
        //runEjercicio3();
        runEjercicio4();
       

    }
    public static void runEjercicio1(){
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        InsertBSTTest bstTest = new InsertBSTTest(values);
        System.out.println("Ejercicio 1. ");
        System.out.println("Arbol en orden:");
        bstTest.printInOrder();
        
    }

    public static void runEjercicio2(){
    
        int[] valores = {1,2,3,4,6,7,9};
        InvertBinaryTree arbol = new InvertBinaryTree(valores);

        System.out.println();
        System.out.println("Ejercicio 2. ");
        System.out.println("Arbol original: ");
        arbol.imprimir();  
        System.out.println();
        arbol.invertTree();
        System.out.println("Arbol invertido: ");
        arbol.imprimir();
        System.out.println();
        System.out.println();


    }

    public static void runEjercicio3(){
        ArbolBinario arbol = new ArbolBinario();
        ListLeves levels = new ListLeves();
        int[] valores = {1,2,3,4,6,7,9};
          for(int i = 0; i < valores.length; i++){
               arbol.insert(valores[i]);
         }
        System.out.println("Ejercicio 3. ");
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
    public static void runEjercicio4(){
        Depth tree = new Depth();
        int[] valores = {1, 2, 3, 4, 7, 8};
        Node root = null;
        
        for (int val : valores) {
            root = tree.insertar(root, val);
        }
        System.out.println("Ejercicio 4. ");
        System.out.println("Orden del árbol: ");
        tree.imprimir(root);
        System.out.println();

        int depth = tree.maxDepth(root);
        System.out.println("La profundidad máxima del árbol es: " + depth);
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
