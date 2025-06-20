/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;
import java.util.ArrayList;
import java.util.List;

public class Doctor extends Persona{
    private List<Paciente> pacientes;
    private String contrasena;
    private String usuario; 

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public Doctor(String nombre, String apellido, String contrasena, String Usuario) {
        super(nombre, apellido);
        
    } 
    public void agregarPaciente(Paciente pac){
        if(pacientes == null) this.pacientes = new ArrayList<>();
        this.pacientes.add(pac);
    }
    public List<Paciente> getPacientes(){
        return this.pacientes;
    }
}