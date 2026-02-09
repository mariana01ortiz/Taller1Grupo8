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
        System.out.println("Ingrese el ID a buscar:");
        String IDbuscar = leer.next();
        boolean encontrado = false;
        for (int i = 0; i < 200; i++) {
            if (prestamos[1][i] != null && prestamos[1][i].equals(IDbuscar)) {
                System.out.println("ID del usuario: " + prestamos[1][i]);
                System.out.println("Nombre del usuario: " + prestamos[2][i]);
                System.out.println("Libro: " + prestamos[3][i]);
                System.out.println("Días de préstamo: " + prestamos[4][i]);
                System.out.println("Multa por día: " + prestamos[5][i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró usuario con ese ID");
        }
    }

    static void actualizarPrestamo() { 
        System.out.println("Ingrese el ID del préstamo que desea cambiar:");
        String idBuscar = leer.next();
        boolean encontrado = false;
        for (int i = 0; i < 200; i++) {
            if (prestamos[1][i] != null && prestamos[1][i].equals(idBuscar)) {
                    
                System.out.println("Ingrese el nuevo ID:");
                prestamos[1][i] = leer.nextLine();
                System.out.println("Ingrese el nuevo nombre:");
                prestamos[2][i] = leer.nextLine();
                System.out.println("Ingrese el nuevo título del libro:");
                prestamos[3][i] = leer.nextLine();
                System.out.println("Ingrese los días de préstamo:");
                prestamos[4][i] = leer.nextLine();
                System.out.println("Ingrese la multa por día:");
                prestamos[5][i] = leer.nextLine();
                System.out.println("Préstamo actualizado correctamente.");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el préstamo.");
        }
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