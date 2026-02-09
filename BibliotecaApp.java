import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    // prestamo = [idPrestamo, nombreUsuario, tituloLibro, diasPrestamo, multaPorDia]
    static ArrayList<ArrayList<Object>> prestamos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    String prestamos[][]= new int [5][200];

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> registrarPrestamo();
                case 2 -> mostrarPrestamos();
                case 3 -> buscarPrestamoPorId();
                case 4 -> actualizarPrestamo();
                case 5 -> eliminarPrestamo();
                case 6 -> calcularTotalMultas();
                case 7 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
            System.out.println();
        } while (opcion != 7);

        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("=== Biblioteca: Gestión de Préstamos ===");
        System.out.println("1. Registrar nuevo préstamo");
        System.out.println("2. Mostrar todos los préstamos");
        System.out.println("3. Buscar préstamo por ID");
        System.out.println("4. Actualizar un préstamo");
        System.out.println("5. Eliminar un préstamo");
        System.out.println("6. Calcular total de multas");
        System.out.println("7. Salir");
    }

    // ====== CRUD (por implementar) ======
    static void registrarPrestamo() { /* TODO */ }
    static void mostrarPrestamos() { /* TODO */ }
    static void buscarPrestamoPorId() { 
        System.out.println("Ingrese el ID a buscar:")
        int IDbuscar;
        Boolean encontrado = false;
        IDbuscar = leer.nextInt();
        while (int j < 200){
            if (IDbuscar = prestamos [1][i]){
                System.out.println("ID del usuario: " + prestamos [1][i]);
                System.out.println("Nombre del usuario: " + prestamos [2][i]);
                System.out.println("Libro: " + prestamos [3][i]);
                System.out.println("Dias de prestamo: " + prestamos [4][i]);
                System.out.println("Multa por dia: " + prestamos [5][i]);
                encontrado = true;
            }else{
                i = i+1;
            }
            if (encontrado = false){
            System.out.println ("no se encontro usuario con ese id")
        }
     }
    static void actualizarPrestamo() { 
        System.out.println ("Ingrese el numero del prestamo que desea cambiar: ")
        int NumeroU;
        NumeroU = leer.nextInt();
        
                System.out.println("Ingrese El nuevo ID:")
                prestamos [1][i]= sc.nextLine;
                System.out.println("Ingrese El nuevo Nombre:")
                prestamos [2][i]= sc.nextLine;
                System.out.println("Ingrese El nuevo título del Libro:")
                prestamos [3][i]= sc.nextLine;
                System.out.println("Ingrese Los días de prestamo:")
                prestamos [4][i]= sc.nextLine;
                System.out.println("Ingrese La multa por día:")
                prestamos [5][i]= sc.nextLine;
        }
    static void eliminarPrestamo() { /* TODO */ }

    // ====== Cálculo (por implementar) ======
    static void calcularTotalMultas() { 
        
        

     }

    // ====== Utilidades mínimas ======
    static int leerEntero(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Ingrese un entero válido.");
            }
        }
    }

    static String leerTexto(String msg) {
        System.out.print(msg);
        return sc.nextLine().trim();
    }
}