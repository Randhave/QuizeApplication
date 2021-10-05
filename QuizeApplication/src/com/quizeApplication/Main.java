package com.quizeApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    JLabel l2, l3;
    JButton b1, b2;
    JTextField t1;

    Main() {
        IntiliseScreen();
        SetImage();
        UserInfo();
        Buttons();
    }

    public void IntiliseScreen() {
        setBounds(250, 150, 900, 500);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);
        setTitle("Quize Application");
    }

    public void SetImage() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/quizeApplication/images/login.png"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(10, 0, 450, 500);
        add(l1);
    }

    public void UserInfo() {
        JLabel l2 = new JLabel("Quizes Time ");
        l2.setFont((new Font("Viner Hand ITC", Font.BOLD, 50)));
        l2.setForeground(Color.BLACK);
        l2.setBounds(500, 10, 550, 400);
        add(l2);

        l3 = new JLabel("Enter your name ");
        l3.setFont((new Font("Mongolian Baiti", Font.BOLD, 20)));
        l3.setBounds(500, 80, 500, 400);
        l3.setForeground(Color.BLACK);
        add(l3);

        t1 = new JTextField();
        t1.setBounds(500, 300, 250, 30);
        t1.setFont((new Font("Mongolian Baiti", Font.BOLD, 15)));
        add(t1);
    }

    public void Buttons() {
        b1 = new JButton("Rules");
        b1.setBounds(500, 350, 100, 40);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLUE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Exit");
        b2.setBounds(650, 350, 100, 40);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLUE);
        b2.addActionListener(this);
        add(b2);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == b1) {
            String username = t1.getText();
            if (username.isBlank()) {
                JOptionPane.showMessageDialog(this, "Please Enter username");
                return;
            }
            this.setVisible(false);
            new Rules(username).setVisible(true);
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world");
        new Main().setVisible(true);
    }

}
// Swing : swing are the java tool , it provide GUI method
// AWT : awt are the java tool , it also provide many GUI method and event handling method