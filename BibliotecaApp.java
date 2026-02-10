
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
                case 1:
                    registrarPrestamo();
                    break;
                case 2:
                    mostrarPrestamos();
                    break;
                case 3:
                    buscarPrestamoPorId();
                    break;
                case 4:         
                    actualizarPrestamo();
                    break;
                case 5:
                    eliminarPrestamo();
                    break;
                case 6:
                    calcularTotalMultas();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
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
        System.out.print("Nombre de Usuario");
        System.out.print("Titulo del Libro");
        System.out.print("Dias de prestamo");
        System.out.print("Valor de multa por dia");

        for (int i = 0; i < 200; i++) {
            System.out.print("\n");
            System.out.print(Prestamos[0][i]);
            System.out.print(Prestamos[1][i]);
            System.out.print(Prestamos[2][i]);
            System.out.print(Prestamos[3][i]);
            System.out.print(Prestamos[4][i]);
            System.out.print("\n");
        }

 
    }
    
    static void buscarPrestamoPorId() { 
        System.out.println("Ingrese el ID a buscar:");
        String IDbuscar = sc.next();
        boolean encontrado = false;
        for (int i = 0; i < 200; i++) {
            if (Prestamos[1][i] != null && Prestamos[1][i].equals(IDbuscar)) {
                System.out.println("ID del usuario: " + Prestamos[1][i]);
                System.out.println("Nombre del usuario: " + Prestamos[2][i]);
                System.out.println("Libro: " + Prestamos[3][i]);
                System.out.println("Días de préstamo: " + Prestamos[4][i]);
                System.out.println("Multa por día: " + Prestamos[5][i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró usuario con ese ID");
        }
    }

    static void actualizarPrestamo() { 
        System.out.println("Ingrese el ID del préstamo que desea cambiar:");
        String idBuscar = sc.next();
        boolean encontrado = false;
        for (int i = 0; i < 200; i++) {
            if (Prestamos[1][i] != null && Prestamos[1][i].equals(idBuscar)) {
                    
                System.out.println("Ingrese el nuevo ID:");
                Prestamos[1][i] = sc.nextLine();
                System.out.println("Ingrese el nuevo nombre:");
                Prestamos[2][i] = sc.nextLine();
                System.out.println("Ingrese el nuevo título del libro:");
                Prestamos[3][i] = sc.nextLine();
                System.out.println("Ingrese los días de préstamo:");
                Prestamos[4][i] = sc.nextLine();
                System.out.println("Ingrese la multa por día:");
                Prestamos[5][i] = sc.nextLine();
                System.out.println("Préstamo actualizado correctamente.");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el préstamo.");
        }
    }
 

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
