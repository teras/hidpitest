/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hidpitest;

import javax.swing.*;

public class TestFrame extends javax.swing.JFrame {
    private JFileChooser chooser = new javax.swing.JFileChooser();

    public TestFrame() {
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileM = new javax.swing.JMenu();
        QuitM = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setText("This");
        getContentPane().add(jLabel1);

        jLabel4.setText("is");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);

        jLabel5.setText("some text");
        getContentPane().add(jLabel5);

        FileM.setText("File");

        QuitM.setText("Quit");
        QuitM.addActionListener(evt -> System.exit(0));
        FileM.add(QuitM);

        jMenuBar1.add(FileM);

        setJMenuBar(jMenuBar1);
        setSize(600, 400);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFrame().setVisible(true);
            }
        });
    }

    private javax.swing.JMenu FileM;
    private javax.swing.JMenuItem QuitM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
}
