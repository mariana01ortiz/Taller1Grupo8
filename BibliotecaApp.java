
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
        for (int i = 0; i < 200; i++) {
            System.out.println("Ingrese su Identificación");
            String id = sc.nextLine();
            Prestamos[0][i] = id;
            System.out.println("Ingrese su Nombre de Usuario");
            String nu = sc.nextLine();
            Prestamos[1][i] = nu;
            System.out.println("Ingrese el Titulo del Libro");
            String tl = sc.nextLine();
            Prestamos[2][i] = tl;
            System.out.println("Ingrese los días de prestamos ");
            String dp = sc.nextLine();
            Prestamos[3][i] = dp;
            System.out.println("Ingrese la multa por dia");
            String md = sc.nextLine();
            Prestamos[4][i] = md;
        }

    }

    static void mostrarPrestamos() {
        System.out.print("ID");
        System.out.print("Nombre de Usuario:");
        System.out.print("ID");
        System.out.print("ID");
        System.out.print("ID");

        for (int i = 0; i < 200; i++) {
            System.out.print(Prestamos[0][i]);
            System.out.print(Prestamos[1][i]);
            System.out.print(Prestamos[2][i]);
            System.out.print(Prestamos[3][i]);
            System.out.print(Prestamos[4][i]);
            System.out.print("\n");
        }

    }

    static void buscarPrestamoPorId() {
        /* TODO */ }

    static void actualizarPrestamo() {
        /* TODO */ }

    static void eliminarPrestamo() {
        /* TODO */ }

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
