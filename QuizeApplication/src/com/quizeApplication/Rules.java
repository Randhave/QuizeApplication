package com.quizeApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {

    ImageIcon i1;
    JLabel l1, l2, l3, l4;
    JButton b1, b2;
    String username;

    Rules(String username) {
        this.username = username;
        initiliseScreen();
        UserName(username);
        Rules();
        Buttons();
    }

    public void initiliseScreen() {
        setBounds(400, 100, 700, 500);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);
        setTitle("Rules for user");
    }

    public void UserName(String username) {
        l2 = new JLabel("Welcome  " + username + "  to Quize Session");
        l2.setFont((new Font("Viner Hand ITC", Font.BOLD, 22)));
        l2.setForeground(Color.GREEN);
        l2.setBounds(120, 10, 600, 40);
        add(l2);
    }

    public void Rules() {
        l3 = new JLabel("Rules :-");
        l3.setForeground(Color.WHITE);
        l3.setFont((new Font("Viner Hand ITC", Font.BOLD, 20)));
        l3.setForeground(Color.WHITE);
        l3.setBounds(15, 70, 600, 20);
        add(l3);

        l4 = new JLabel();
        l4.setForeground(Color.WHITE);
        l4.setBounds(15, 45, 600, 380);
        l4.setText("<html>"
                + "1. You are trained to be a programmer and not a story teller, answer point to " + "<br><br>"
                + "2. Do not unnecessary smile at the person sitting next to you , they may also not know the answer" + "<br><br>"
                + "3. You may have lot of options in life but there all the questions are compulsory" + "<br><br>"
                + "4. Crying is allowed but please do so quietly " + "<br><br>"
                + "5. Only a fool asks and a wise answers (Be wise , not otherwise)  " + "<br><br>"
                + "6. Do not get nervous if your friend is answering more questions, may be the he/she is doing God please help " + "<br><br>"
                + "7. Total 10 questions , and Each questions will get 10 makrs" + "<br><br>"
                + "8. May you know more than what join snow knows Good Luck... " + "<br><br>"
                + "<html>");
        add(l4);

    }

    public void Buttons() {
        b1 = new JButton("Back");
        b1.setBounds(15, 370, 100, 35);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLUE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(150, 370, 100, 35);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLUE);
        b2.addActionListener(this);
        add(b2);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == b1) {
            new Main().setVisible(true);
            this.setVisible(false);
        } else if (event.getSource() == b2) {
            this.setVisible(false);
            new Quize(username).setVisible(true);
        } else {
            System.out.println("Start the quize...");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello user");
        new Rules("Aniket Randhave").setVisible(true);
    }


}
