import java.util.ArrayList;

public class Veterinaria {

    private ArrayList<Mascota> listaMascotas;

    public Veterinaria()
    {
        listaMascotas = new ArrayList<>();
    }

    public void registrarMascota(Mascota mascota)
    {
        listaMascotas.add(mascota);
        System.out.println("Mascota registrada con exito."); 
    }

    public void mostrarMascota()
    {
        if(listaMascotas.isEmpty())
        {
            System.out.println("No hay mascotas registradas.");
        }else 
        {
            System.out.println("Lista de mascotas registradas");
            for(Mascota m : listaMascotas)
            {
                m.mostrarInfo();
            }
        }
    }
}
