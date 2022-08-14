/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author carlo
 */
public class EliminarUSER extends JFrame {

    Object usuarios[][] = new Object[50][9];
    JPanel p5 = new JPanel();

    public void ELIMINAREXE(int idE) throws ClassNotFoundException{
        loadTable();
        setTitle("HotelesGT-Administrador");
        setLocationRelativeTo(null);
        setSize(350, 450);
        setLocation(800, 300);
        setVisible(true);
        p5.setLayout(null);
        p5.setBackground(Color.white);
        add(p5);


        JLabel l1 = new JLabel("Eliminar Usuario");
        l1.setBounds(140, 20, 100, 20);
        p5.add(l1);

        JLabel l2 = new JLabel("Nombre:");
        l2.setBounds(20, 60, 150, 40);
        p5.add(l2);

        JLabel l3 = new JLabel("Apellido:");
        l3.setBounds(20, 100, 150, 40);
        p5.add(l3);

        JLabel l4 = new JLabel("Telefono:");
        l4.setBounds(20, 140, 150, 40);
        p5.add(l4);

        JLabel l5 = new JLabel("Direccion:");
        l5.setBounds(20, 180, 150, 40);
        p5.add(l5);

        JLabel l6 = new JLabel("Correo:");
        l6.setBounds(20, 220, 150, 40);
        p5.add(l6);

        JLabel l7 = new JLabel("Fecha de nacimiento:");
        l7.setBounds(20, 260, 150, 40);
        p5.add(l7);

        JLabel l8 = new JLabel("Contraseña:");
        l8.setBounds(20, 300, 150, 40);
        p5.add(l8);

        JTextField t1 = new JTextField();
        t1.setBounds(100, 65, 200, 30);
        p5.add(t1);
        t1.setText(usuarios[idE][1]+"");
        t1.setEnabled(false);

        JTextField t2 = new JTextField();
        t2.setBounds(100, 105, 200, 30);
        p5.add(t2);
        t2.setText(usuarios[idE][2]+"");
        t2.setEnabled(false);

        JTextField t3 = new JTextField();
        t3.setBounds(100, 145, 200, 30);
        p5.add(t3);
        t3.setText(usuarios[idE][3]+"");
        t3.setEnabled(false);

        JTextField t4 = new JTextField();
        t4.setBounds(100, 185, 200, 30);
        p5.add(t4);
        t4.setText(usuarios[idE][4]+"");
        t4.setEnabled(false);

        JTextField t5 = new JTextField();
        t5.setBounds(100, 225, 200, 30);
        p5.add(t5);
        t5.setText(usuarios[idE][5]+"");
        t5.setEnabled(false);

        JTextField t6 = new JTextField();
        t6.setBounds(150, 265, 150, 30);
        p5.add(t6);
        t6.setText(usuarios[idE][6]+"");
        t6.setEnabled(false);

        JTextField t7 = new JTextField();
        t7.setBounds(100, 305, 200, 30);
        p5.add(t7);
        t7.setText(usuarios[idE][7]+"");
        t7.setEnabled(false);

        JButton b1 = new JButton("Eliminar Usuario");
        b1.setBounds(35, 350, 150, 40);
        p5.add(b1);

        JButton b2 = new JButton("Cancelar");
        b2.setBounds(195, 350, 100, 40);
        p5.add(b2);
        
        ActionListener btnEliminar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                 for (int i = idE; i < usuarios.length; i++) {

                    if (i == usuarios.length - 1) {
                        usuarios[i][0] = null;
                        usuarios[i][1] = null;
                        usuarios[i][2] = null;
                        usuarios[i][3] = null;
                        usuarios[i][4] = null;
                        usuarios[i][5] = null;
                        usuarios[i][6] = null;
                        usuarios[i][7] = null;
                        usuarios[i][8] = null;
                    }else if (usuarios[i][0] == null) {
                        usuarios[i-1][0] = null;
                        break;
                    } 
                    else {
                        usuarios[i][0] = i + 1;
                        usuarios[i][1] = usuarios[i + 1][1];
                        usuarios[i][2] = usuarios[i + 1][2];
                        usuarios[i][3] = usuarios[i + 1][3];
                        usuarios[i][4] = usuarios[i + 1][4];
                        usuarios[i][5] = usuarios[i + 1][5];
                        usuarios[i][6] = usuarios[i + 1][6];
                        usuarios[i][7] = usuarios[i + 1][7];
                        usuarios[i][8] = usuarios[i + 1][8];
                    }
                }
                saveTable();
                dispose();
            
            }
        };

        b1.addActionListener(btnEliminar);

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
