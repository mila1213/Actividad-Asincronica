package SistemaRegistroOlimpiadas;
import java.util.ArrayList;

public abstract class Participante {
    protected String nombre;
    protected String codigo;
    protected int cedula;
    protected String genero;
    protected int edad;
    public Participante(String nombre, String codigo, int cedula, String genero, int edad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cedula = cedula;
        this.genero = genero;
        this.edad = edad;
    }
    public abstract String MostrarInformacion();
}
