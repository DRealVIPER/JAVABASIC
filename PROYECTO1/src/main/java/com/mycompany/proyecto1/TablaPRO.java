/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo
 */
public class TablaPRO extends JFrame {

    JTable tabla = new JTable();
    JScrollPane sp = new JScrollPane();
    JPanel p2 = new JPanel();
    DefaultTableModel dtm;
    Object usuarios[][] = new Object[50][9];
    int x = 0;

    
    private void crearTable() throws ClassNotFoundException {

        setTitle("HotelesGT-Usuarios");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(1500, 750);
        setLocation(200, 150);
        setVisible(true);
        p2.setLayout(null);
        p2.setBackground(Color.white);
        add(p2);
        loadTable();

    }

    void tabla() throws ClassNotFoundException {
        String columnas[] = {"No.", "Nombre:", "Apellido:", "Telefono:", "Direccion:", "Correo:","Fecha de Nacimiento:","Rol:","Contraseña:"};
        tabla = new JTable(usuarios, columnas);
        sp = new JScrollPane(tabla);
        sp.setBounds(20, 80, 1440, 500);
        sp.setVisible(true);
        p2.add(sp);
        loadTable();
    }

    private void design() throws ClassNotFoundException {
        JLabel Tl1 = new JLabel("Usuario: Nombre de Usuario");
        Tl1.setBounds(1300, 30, 300, 40);
        p2.add(Tl1);

        JButton Tb1 = new JButton("Agregar Usuario");
        Tb1.setBounds(0, 0, 130, 40);
        p2.add(Tb1);

        JButton Tb2 = new JButton("Modificar Usuario");
        Tb2.setBounds(130, 0, 150, 40);
        p2.add(Tb2);

        JButton Tb3 = new JButton("Eliminar Usuario");
        Tb3.setBounds(550, 600, 130, 40);
        p2.add(Tb3);

        JButton Tb4 = new JButton("Salir");
        Tb4.setBounds(850, 600, 130, 40);
        p2.add(Tb4);

//Agregar datos a tablas BOTON
        ActionListener btnAgregar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                AgregarUSER s = new AgregarUSER();
                s.AGUSEREXE();

            }
        };
        Tb1.addActionListener(btnAgregar);

        ActionListener btnModificar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModifyUSER m = new ModifyUSER();
                int fila = tabla.getSelectedRow();
                try {
                    m.MDFUSER(fila);
                } catch(ClassNotFoundException exception){
                    Logger.getLogger(TablaPRO.class.getName()).log(Level.SEVERE,null, exception);
                }
            }
        };

        Tb2.addActionListener(btnModificar);
        
          ActionListener btnEliminar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EliminarUSER E = new EliminarUSER();
                int Efila = tabla.getSelectedRow();
                
                try {
                    E.ELIMINAREXE(Efila);
                } catch (ClassNotFoundException exception){
                    Logger.getLogger(TablaPRO.class.getName()).log(Level.SEVERE,null, exception);
                }
                
            }
        };

        Tb3.addActionListener(btnEliminar);
        

        ActionListener btnSalir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        };

        Tb4.addActionListener(btnSalir);

        

    }
    public void ejecutarTable() throws ClassNotFoundException {
        crearTable();
        tabla();
        design();

    }



    public void loadTable() throws ClassNotFoundException {
        try {
            ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("usuarios.dat"));
            usuarios = (Object[][]) recuperar.readObject();
            recuperar.close();
        } catch (IOException s) {
        }

    }

    public static void main(String[] args) throws ClassNotFoundException {
        TablaPRO Tablas = new TablaPRO();
        Tablas.ejecutarTable();
    }

    void ejecutarTable(String administrador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
