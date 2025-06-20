package ventana;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;

public class Ventana extends JFrame {
    private Doctor dc;

    public Ventana(Doctor dc) {
        this.dc = dc;
        setTitle("T3 ");
        setBounds(500, 200, 700, 450);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(175, 110, 350, 225);
        panel.add(panel2);

        JLabel etiqueta = new JLabel("CONSULTORIO DE BREI", SwingConstants.CENTER);
        etiqueta.setBounds(0, 10, 350, 25);
        etiqueta.setOpaque(true);
        etiqueta.setForeground(Color.BLACK);
        panel2.add(etiqueta);

        ImageIcon imagen = new ImageIcon("logo.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(100, 40, 150, 100);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        panel2.add(etiqueta2);

        JLabel labelUsuario = new JLabel("Usuario:");
        labelUsuario.setBounds(40, 150, 80, 25);
        panel2.add(labelUsuario);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(130, 150, 150, 25);
        panel2.add(txtUsuario);

        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setBounds(40, 180, 80, 25);
        panel2.add(lblContrasena);

        JPasswordField txtContrasena = new JPasswordField();
        txtContrasena.setBounds(130, 180, 150, 25);
        panel2.add(txtContrasena);

        JButton btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(100, 210, 150, 25);
        panel2.add(btnIngresar);

        // Evento del botón
        btnIngresar.addActionListener(e -> {
            String usuario = txtUsuario.getText();
            String password = new String(txtContrasena.getPassword());

            // Validación básica (puedes personalizar estos valores)
            if (usuario.equals("Nepta") && password.equals("123")) {
                JOptionPane.showMessageDialog(this, "Acceso permitido");

                // Abrir nueva ventana
                VentanaBusc nueva = new VentanaBusc (dc); // Asegúrate de tener esta clase
                nueva.setVisible(true);
                this.dispose(); // Cierra la ventana actual
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
