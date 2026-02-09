
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    // prestamo = [idPrestamo, nombreUsuario, tituloLibro, diasPrestamo, multaPorDia]
    static ArrayList<ArrayList<Object>> prestamos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static String Prestamos[][] = new String[5][200];

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 ->
                    registrarPrestamo();
                case 2 ->
                    mostrarPrestamos();
                case 3 ->
                    buscarPrestamoPorId();
                case 4 ->
                    actualizarPrestamo();
                case 5 ->
                    eliminarPrestamo();
                case 6 ->
                    calcularTotalMultas();
                case 7 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opción inválida.");
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
    static void registrarPrestamo() {
        /* TODO */ }

    static void mostrarPrestamos() {
        /* TODO */ }

    static void buscarPrestamoPorId() {
        /* TODO */ }

    static void actualizarPrestamo() {
        /* TODO */ }

    // ====== Eliminar prestamos ======
    static void eliminarPrestamo() {
        System.out.print("Ingrese el ID del préstamo a eliminar:");
        int idEliminar = sc.nextInt();
        for (int i = 0; i < 200; i++) {
            if (Integer.parseInt(Prestamos[0][i]) == idEliminar) {
                Prestamos[0][i] = null;
                Prestamos[1][i] = null;
                Prestamos[2][i] = null;
                Prestamos[3][i] = null;
                Prestamos[4][i] = null;
                Prestamos[5][i] = null;
            } else {
                System.out.println("ID no encontrado.");
            }
        }
    }

    // ====== Cálculo de Multas ======
    static void calcularTotalMultas() {

        int multas[] = new int[200];
        for (int i = 0; i < 200; i++) {
            multas[i] = Integer.parseInt(Prestamos[4][i]) * Integer.parseInt(Prestamos[5][i]);
        }

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
