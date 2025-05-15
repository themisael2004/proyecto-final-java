public class Mascota {
    private String nombre;
    private String tipo;
    private int edad;

    public Mascota(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "| tipo: " + tipo + "| edad " + edad);
    }
}
