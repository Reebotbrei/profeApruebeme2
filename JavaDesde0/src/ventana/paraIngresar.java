/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import  javax.swing.*;

public class paraIngresar implements MouseListener  {
    private JFrame padre;
    private Doctor dc;
    private String con;
    public paraIngresar(JFrame padre, Doctor dc, String constrasena){
        this.padre = padre;
        this.dc = dc;
        this.con = constrasena;
       
    }
    // aqui courre el evento, se puede traer una clase como parametro, faltan
    @Override
    public void mouseClicked(MouseEvent e) {
       if(con != dc.getContrasena()) return;
       VentanaBusc bc = new VentanaBusc(dc);    
            
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}