import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArbolBST arbol = new ArbolBST();
        int opcion;

        do {
            System.out.println("\n    SISTEMA BST - FEDEGAN CASANARE    ");
            System.out.println("1. Insertar una finca");
            System.out.println("2. Recorrido PreOrden");
            System.out.println("3. Recorrido InOrden");
            System.out.println("4. Recorrido PostOrden");
            System.out.println("5. Buscar finca por codigo ICA");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(sc.nextLine().trim());

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese su codigo ICA entero: ");
                    int dato = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("Ingrese Nombre Finca: ");
                    String nombreFinca = sc.nextLine().trim();
                    System.out.print("Ingrese Nombre Municipio: ");
                    String municipio = sc.nextLine().trim();
                    arbol.insertar(dato, nombreFinca, municipio);
                    System.out.println("Dato " + dato + " insertado.");
                    break;

                case 2:
                    arbol.preOrden();
                    break;

                case 3:
                    arbol.inOrden();
                    break;

                case 4:
                    arbol.postOrden();
                    break;

                case 5:
                    System.out.print("Ingrese codigo ICA a buscar: ");
                    int codigo = Integer.parseInt(sc.nextLine().trim());
                    NodoBST resultado = arbol.buscar(codigo);
                    if (resultado != null)
                        System.out.println("Encontrado: " + resultado);
                    else
                        System.out.println("Codigo " + codigo + " no registrado.");
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }

        } while (opcion != 6);

        sc.close();
    }
}