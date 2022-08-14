/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.proyecto1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


/**
 *
 * @author carlo
 */
public class PROYECTO1 extends JFrame {

    JPanel p1 = new JPanel();
    JTextField LINt1 = new JTextField();
    JPasswordField LINt2 = new JPasswordField();
    Object usuario[][] = new Object[50][9];
    int oportunidades = 3;

    //metodos
    public void inicio() throws ClassNotFoundException {
        load();
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(800, 300, 300, 400);

        p1.setLayout(null);
        add(p1);

        JLabel l1 = new JLabel("Usuario:");
        l1.setBounds(40, 120, 80, 40);
        p1.add(l1);

        LINt1.setBounds(40, 155, 200, 30);
        p1.add(LINt1);

        JLabel l2 = new JLabel("Contraseña:");
        l2.setBounds(40, 190, 80, 40);
        p1.add(l2);

        LINt2.setBounds(40, 225, 200, 30);
        p1.add(LINt2);

        JButton b1 = new JButton("Ingresar");
        b1.setBounds(90, 280, 100, 50);
        p1.add(b1);
        setVisible(true);
        ActionListener verificar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    user();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PROYECTO1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        b1.addActionListener(verificar);

    }

    private void user() throws ClassNotFoundException {
        load();
        TablaPRO run = new TablaPRO();
        boolean op = false;
        if (LINt1.getText().equals("Admin") && LINt2.getText().equals("Admin")) {
            JOptionPane.showMessageDialog(null, "Usuario Correcto");
            run.ejecutarTable();
        } else {
            for (int i = 0; i < usuario.length; i++) {
                if (usuario[i][1].equals(LINt1.getText()) && usuario[i][8].equals(LINt2.getText())) {
                    run.ejecutarTable();
                    op = true;
                    dispose();
                    break;
                }
            }
            if (op == false) {
                oportunidades--;
                if (oportunidades == 0) {
                    JOptionPane.showMessageDialog(null, "Se acabaron las oportunidades");
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Datos incorrectos, te quedan " + oportunidades + " oportunidades");
                }
            }
        }
    }

    public void load() throws ClassNotFoundException {
        try {
            ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("usuarios.dat"));
            usuario = (Object[][]) recuperar.readObject();
            recuperar.close();
        } catch (IOException s) {
        }
    }

    public void ejecutarLogin() throws ClassNotFoundException {
        inicio();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        PROYECTO1 run = new PROYECTO1();
        run.ejecutarLogin();
    }
}
