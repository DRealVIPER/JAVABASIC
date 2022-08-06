/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.llenadotabla;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.lang.model.util.ElementScanner14;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo
 */
public class LlenadoTabla extends JFrame {

    JTable tabla = new JTable();
    JScrollPane sp = new JScrollPane();
    JPanel p1 = new JPanel();
    DefaultTableModel dtm;
    private ArrayList<LlenadoTabla> Lis;
    Object filas[][] = new Object[50][3];
    int x = 0;

    private void tabla() {
        String columnas[] = {"Nombre", "Apellido", "Telefono"};


        tabla = new JTable(filas, columnas);
        sp = new JScrollPane(tabla);
        sp.setBounds(20, 40, 500, 300);
        sp.setVisible(true);
        p1.add(sp);

        JLabel l1 = new JLabel("Ingresa tu Nombre");
        l1.setBounds(20, 350, 150, 40);
        p1.add(l1);

        JLabel l2 = new JLabel("Ingresa tu Apellido");
        l2.setBounds(20, 400, 150, 40);
        p1.add(l2);

        JLabel l3 = new JLabel("Ingresa tu No Tel.");
        l3.setBounds(20, 450, 150, 40);
        p1.add(l3);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 350, 150, 40);
        p1.add(t1);
        t1.setText("Escriba el texto...");

        JTextField t2 = new JTextField();
        t2.setBounds(150, 400, 150, 40);
        p1.add(t2);
        t2.setText("Escriba el texto...");

        JTextField t3 = new JTextField();
        t3.setBounds(150, 450, 150, 40);
        p1.add(t3);
        t3.setText("Escriba el texto...");

        JButton b1 = new JButton("Añadir");
        b1.setBounds(550, 50, 100, 70);
        p1.add(b1);

        JButton b2 = new JButton("Actualizar");
        b2.setBounds(550, 150, 100, 70);
        p1.add(b2);

        JButton b3 = new JButton("Borrar");
        b3.setBounds(550, 250, 100, 70);
        p1.add(b3);
//Agregar datos a tablas BOTON
        ActionListener Añadir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if (!(t1.getText().equals("")) && !(t2.getText().equals("")) && !(t3.getText().equals(""))) {
            agregar(t1.getText(), t2.getText(),Integer.parseInt(t3.getText()));
        }else{
              JOptionPane.showMessageDialog(null, "Completa los datos");
            }
        }
        };
        b1.addActionListener(Añadir);

        ActionListener Actualizar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                Actualizar tabla
                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
                
                sp.setVisible(false);
                tabla();
            }
        };

        b2.addActionListener(Actualizar);

        ActionListener Borrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
            }
        };

        b3.addActionListener(Borrar);
    }
//Agregar datos a tablas METODO
    private void agregar(String nombre, String apellido, int telefono) {
        
        if (x == 50) {
            JOptionPane.showMessageDialog(this, "Ya no se permiten mas registros");
        } else {
            filas[x][0] = nombre;
            filas[x][1] = apellido;
            filas[x][2] = telefono;
            x++;
            
        }
    }

    private void crear() {
        setTitle("Mostrar Tablas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(700, 650);
        setLocation(700,200);
        setVisible(true);
        p1.setLayout(null);
        p1.setBackground(Color.white);
        add(p1);

    }

    public void ejecutar() {
        crear();
        tabla();

    }

    public static void main(String[] args) {
        LlenadoTabla Tablas = new LlenadoTabla();
        Tablas.ejecutar();
    }
}
