package javaapplication9;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import sun.print.DialogOwner;

public class pene extends JFrame {

    public pene() throws HeadlessException {
        this.setTitle("Hola");
        this.setSize(300, 300);
        this.setResizable(false);
        //this.setMinimumSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JDialog dialogo = new JDialog();
        JPanel panelDialogo = new JPanel();
        JButton botonDialogo = new JButton("Cerrar");
        dialogo.setResizable(false);
        dialogo.setSize(200, 100);
        
        JTextArea texto = new JTextArea();
        JScrollPane scroll = new JScrollPane(texto);
        JPanel panel = new JPanel();
        JPanel panelBotones = new JPanel();
        JButton boton1 = new JButton("DIALOGO!!");
        JButton boton2 = new JButton("Coge el texto");

        dialogo.setLayout(new BorderLayout());
        panel.setLayout(new BorderLayout());
        panelBotones.setLayout(new FlowLayout());

        panelBotones.add(boton1);
        panelBotones.add(boton2);

        dialogo.add(panelDialogo, BorderLayout.CENTER);
        dialogo.add(botonDialogo, BorderLayout.SOUTH);
        
        panel.add(scroll, BorderLayout.CENTER);
        panel.add(panelBotones, BorderLayout.SOUTH);

        botonDialogo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dialogo.setVisible(false);
            }
        });
        boton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dialogo.setVisible(true);
            }
        });

        boton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(texto.getText());

            }
        });
        this.getContentPane().add(panel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new pene();
    }
}
