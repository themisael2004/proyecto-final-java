import java.util.Scanner;

public class MenuVeterinaria {
    private Veterinaria veterinaria;
    private Scanner scanner;

    public MenuVeterinaria() {
        veterinaria = new Veterinaria();
        scanner = new Scanner(System.in);
    }

    public void ejecutar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Ingrese una opcion");

            switch (opcion) {
                case 1 -> registrarMascota();
                case 2 -> veterinaria.mostrarMascota();
                case 3 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opcion invalida");
            }
        } while (opcion != 3);

        scanner.close();

    }

    private void mostrarMenu() {
        System.out.println("\n--- Sistema de Gestión de Clínica Veterinaria ---");
        System.out.println("1. Registrar nueva mascota");
        System.out.println("2. Mostrar mascotas registradas");
        System.out.println("3. Salir");
    }

    private void registrarMascota() {
        System.out.println("Nombre de la mascota: ");
        String nombre = scanner.nextLine();
        System.out.println("Tipo de mascota (ej. perro, gao): ");
        String tipo = scanner.nextLine();
        int edad = leerEntero("Edad de la mascota");

        Mascota nueva = new Mascota(nombre, tipo, edad);
        veterinaria.registrarMascota(nueva);
    }

    private int leerEntero(String mensaje) {
        System.out.println(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor ingrese un numero valido.");
            scanner.next();
            System.out.println(mensaje);
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
}
