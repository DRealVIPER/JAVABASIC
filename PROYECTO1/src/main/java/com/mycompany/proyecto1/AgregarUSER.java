/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author carlo
 */
public class AgregarUSER extends JFrame {

    Object usuarios[][] = new Object[50][9];
    JPanel p3 = new JPanel();
    int x = 0;

    public void AGUSEREXE() {

        setTitle("HotelesGT-Administrador");
        setLocationRelativeTo(null);
        setSize(350, 530);
        setLocation(800, 400);
        setVisible(true);
        p3.setLayout(null);
        p3.setBackground(Color.white);
        add(p3);

        JLabel AUl1 = new JLabel("Agregar Usuario");
        AUl1.setBounds(120, 20, 100, 20);
        p3.add(AUl1);

        JLabel AUl2 = new JLabel("Nombre:");
        AUl2.setBounds(20, 60, 150, 40);
        p3.add(AUl2);

        JLabel AUl3 = new JLabel("Apellido:");
        AUl3.setBounds(20, 100, 150, 40);
        p3.add(AUl3);

        JLabel AUl4 = new JLabel("Telefono:");
        AUl4.setBounds(20, 140, 150, 40);
        p3.add(AUl4);

        JLabel AUl5 = new JLabel("Direccion:");
        AUl5.setBounds(20, 180, 150, 40);
        p3.add(AUl5);

        JLabel AUl6 = new JLabel("Correo:");
        AUl6.setBounds(20, 220, 150, 40);
        p3.add(AUl6);

        JLabel AUl7 = new JLabel("Fecha de nacimiento:");
        AUl7.setBounds(20, 260, 150, 40);
        p3.add(AUl7);

        JLabel AUl8 = new JLabel("Contraseña:");
        AUl8.setBounds(20, 300, 150, 40);
        p3.add(AUl8);

        JTextField t1 = new JTextField();
        t1.setBounds(100, 65, 200, 30);
        p3.add(t1);
        t1.setText("");

        JTextField t2 = new JTextField();
        t2.setBounds(100, 105, 200, 30);
        p3.add(t2);
        t2.setText("");

        JTextField t3 = new JTextField();
        t3.setBounds(100, 145, 200, 30);
        p3.add(t3);
        t3.setText("");

        JTextField t4 = new JTextField();
        t4.setBounds(100, 185, 200, 30);
        p3.add(t4);
        t4.setText("");

        JTextField t5 = new JTextField();
        t5.setBounds(100, 225, 200, 30);
        p3.add(t5);
        t5.setText("");

        JTextField t6 = new JTextField();
        t6.setBounds(150, 265, 150, 30);
        p3.add(t6);
        t6.setText("[dd/mm/yy]");

        JTextField t7 = new JTextField();
        t7.setBounds(100, 305, 200, 30);
        p3.add(t7);
        t7.setText("");
//        t3.setEnabled(false);

        JButton b1 = new JButton("Guardar");
        b1.setBounds(50, 420, 100, 40);
        p3.add(b1);

        JButton b2 = new JButton("Cancelar");
        b2.setBounds(180, 420, 100, 40);
        p3.add(b2);

        ButtonGroup bg = new ButtonGroup();

        JRadioButton c1 = new JRadioButton("Activo", true);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Arial", Font.PLAIN, 20));
        c1.setBounds(50, 360, 100, 50);
        bg.add(c1);
        p3.add(c1);
        JRadioButton c2 = new JRadioButton("Inactivo", false);
        c2.setBackground(Color.white);
        c2.setFont(new Font("Arial", Font.PLAIN, 20));
        c2.setBounds(180, 360, 100, 50);
        bg.add(c2);
        p3.add(c2);
        if (c1.equals(true)) {
        usuarios[0][7] = "Activo";
        } else {
        usuarios[0][7] = "Inactivo";
        }

//Agregar datos a tablas BOTON
        ActionListener btnGuardar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (x == 50) {
                    JOptionPane.showMessageDialog(null, "Ya no se permiten mas registros");
                } else {
                if (!("".equals(t1.getText())) && !("".equals(t2.getText())) && !("".equals(t3.getText())) && !("".equals(t4.getText())) && !("".equals(t5.getText())) && !("".equals(t6.getText())) && !("".equals(t7.getText()))) {
                    try {
                        loadTable();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(AgregarUSER.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (usuarios[0][0] == null) {
                        usuarios[0][0] = 1;
                        usuarios[0][1] = t1.getText();
                        usuarios[0][2] = t2.getText();
                        usuarios[0][3] = t3.getText();
                        usuarios[0][4] = t4.getText();
                        usuarios[0][5] = t5.getText();
                        usuarios[0][6] = t6.getText();
                        usuarios[0][8] = t7.getText();

                        if (c1.equals(true)) {
                            usuarios[0][7] = "Activo";

                        } else {
                            usuarios[0][7] = "Inactivo";

                        }

                    } else {
                        int x = Integer.parseInt(usuarios[0][0] + "");
                        for (int i = 1; i < usuarios.length; i++) {
                            if (usuarios[i][0] == null) {

                                usuarios[i][0] = x + 1;
                                usuarios[i][1] = t1.getText();
                                usuarios[i][2] = t2.getText();
                                usuarios[i][3] = t3.getText();
                                usuarios[i][4] = t4.getText();
                                usuarios[i][5] = t5.getText();
                                usuarios[i][6] = t6.getText();
                                usuarios[i][8] = t7.getText();

                                if (c1.equals(true)) {
                                    usuarios[i][7] = "Activo";

                                } else {
                                    usuarios[i][7] = "Inactivo";

                                }
                                break;
                            } else {
                                x++;
                            }

                        }
                        saveTable();
                        TablaPRO sp = new TablaPRO();
                        sp.tabla.setVisible(false);
                        sp.tabla.setVisible(true);
                    }

                    saveTable();
                    dispose();
                    try {
                        loadTable();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(AgregarUSER.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
                }

            }
            }
        };
        b1.addActionListener(btnGuardar);

        ActionListener btnCancelar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
                t4.setText(null);
                t5.setText(null);
                t6.setText(null);
                t7.setText(null);
                dispose();
            }
        };

        b2.addActionListener(btnCancelar);

    }

    public void saveTable() {
        try {
            ObjectOutputStream tabla = new ObjectOutputStream(new FileOutputStream("usuarios.dat"));
            tabla.writeObject(usuarios);
        } catch (IOException s) {
        }
    }

    public void loadTable() throws ClassNotFoundException {
        try {
            ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("usuarios.dat"));
            usuarios = (Object[][]) recuperar.readObject();
            recuperar.close();
        } catch (IOException s) {
        }

    }

    public void agregar() throws ClassNotFoundException {
        AgregarUSER Ag = new AgregarUSER();
        saveTable();
        setVisible(false);
        loadTable();
    }
}
