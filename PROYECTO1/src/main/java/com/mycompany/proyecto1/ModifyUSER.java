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
public class ModifyUSER extends JFrame {

    Object usuarios[][] = new Object[50][9];
    int x = 0;
    JPanel p4 = new JPanel();

    public void MDFUSER(int id) throws ClassNotFoundException {
        loadTable();
        setTitle("HotelesGT-Administrador");
        setLocationRelativeTo(null);
        setSize(350, 530);
        setLocation(800, 300);
        setVisible(true);
        p4.setLayout(null);
        p4.setBackground(Color.white);
        add(p4);

        JLabel l1 = new JLabel("Modificar Usuario");
        l1.setBounds(140, 20, 100, 20);
        p4.add(l1);

        JLabel l2 = new JLabel("Nombre:");
        l2.setBounds(20, 60, 150, 40);
        p4.add(l2);

        JLabel l3 = new JLabel("Apellido:");
        l3.setBounds(20, 100, 150, 40);
        p4.add(l3);

        JLabel l4 = new JLabel("Telefono:");
        l4.setBounds(20, 140, 150, 40);
        p4.add(l4);

        JLabel l5 = new JLabel("Direccion:");
        l5.setBounds(20, 180, 150, 40);
        p4.add(l5);

        JLabel l6 = new JLabel("Correo:");
        l6.setBounds(20, 220, 150, 40);
        p4.add(l6);

        JLabel l7 = new JLabel("Fecha de nacimiento:");
        l7.setBounds(20, 260, 150, 40);
        p4.add(l7);

        JLabel l8 = new JLabel("Contraseña:");
        l8.setBounds(20, 300, 150, 40);
        p4.add(l8);

        JTextField t1 = new JTextField();
        t1.setBounds(100, 65, 200, 30);
        p4.add(t1);
        t1.setText(usuarios[id][1] + "");

        JTextField t2 = new JTextField();
        t2.setBounds(100, 105, 200, 30);
        p4.add(t2);
        t2.setText(usuarios[id][2] + "");

        JTextField t3 = new JTextField();
        t3.setBounds(100, 145, 200, 30);
        p4.add(t3);
        t3.setText(usuarios[id][3] + "");

        JTextField t4 = new JTextField();
        t4.setBounds(100, 185, 200, 30);
        p4.add(t4);
        t4.setText(usuarios[id][4] + "");

        JTextField t5 = new JTextField();
        t5.setBounds(100, 225, 200, 30);
        p4.add(t5);
        t5.setText(usuarios[id][5] + "");

        JTextField t6 = new JTextField();
        t6.setBounds(150, 265, 150, 30);
        p4.add(t6);
        t6.setText(usuarios[id][6] + "");

        JTextField t7 = new JTextField();
        t7.setBounds(100, 305, 200, 30);
        p4.add(t7);
        t7.setText(usuarios[id][8] + "");
//        t3.setEnabled(false);

        JButton b1 = new JButton("Guardar Cambios");
        b1.setBounds(35, 420, 150, 40);
        p4.add(b1);

        JButton b2 = new JButton("Cancelar");
        b2.setBounds(195, 420, 100, 40);
        p4.add(b2);

        ButtonGroup bg = new ButtonGroup();

        JRadioButton c1 = new JRadioButton("Activo", true);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Arial", Font.PLAIN, 20));
        c1.setBounds(50, 360, 100, 50);
        bg.add(c1);
        p4.add(c1);
        JRadioButton c2 = new JRadioButton("Inactivo", false);
        c2.setBackground(Color.white);
        c2.setFont(new Font("Arial", Font.PLAIN, 20));
        c2.setBounds(180, 360, 100, 50);
        bg.add(c2);
        p4.add(c2);
        if (c1.equals(true)) {
//            usuarios.setActivo(1);

        } else {
            //usuarios.setActivo(0);

        }

//Agregar datos a tablas BOTON
        ActionListener btnGuardar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!("".equals(t1.getText())) && !("".equals(t2.getText())) && !("".equals(t3.getText())) && !("".equals(t4.getText())) && !("".equals(t5.getText())) && !("".equals(t6.getText())) && !("".equals(t7.getText()))) {

                    usuarios[id][1] = t1.getText();
                    usuarios[id][2] = t2.getText();
                    usuarios[id][3] = t3.getText();
                    usuarios[id][4] = t4.getText();
                    usuarios[id][5] = t5.getText();
                    usuarios[id][6] = t6.getText();
                    usuarios[id][8] = t7.getText();

                    if (c1.equals(true)) {
                        usuarios[id][7] = "Activo";

                    } else {
                        usuarios[id][7] = "Inactivo";

                    }
                    saveTable();
                    setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
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
            tabla.close();

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
}
