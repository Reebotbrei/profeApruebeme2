/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;
import java.time.LocalDate; 
/**
 *
 * @author Estudiante
 */
public class Paciente extends Persona{
    private LocalDate fecha;
    public Paciente(String nombre, String apellido, LocalDate fec) {
        super(nombre, apellido);
        this.fecha = fec;
    }
    public String getFec(){
        return this.fecha.toString() + " : " + this.getNombre() + " " + this.getApellido();
    }
}