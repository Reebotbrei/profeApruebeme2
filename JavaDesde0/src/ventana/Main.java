/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;

import java.time.LocalDate;

public class Main {
    public static void main (String []args){
        Doctor dc = new Doctor("Alvaro", "Mayo", "Nepta", "123");   
        LocalDate fec = LocalDate.now();
        dc.agregarPaciente(new Paciente("Brei", "Cata", fec));
        dc.agregarPaciente(new Paciente("Elias", "Diaz", fec));
        dc.agregarPaciente(new Paciente("Edwin", "Frepap", fec));
        dc.agregarPaciente(new Paciente("Eli", "Mitma", fec));
        dc.agregarPaciente(new Paciente("Enzi", "Giron", fec));
        Ventana v1 = new Ventana (dc);
        v1.setVisible(true);  
    }
}
