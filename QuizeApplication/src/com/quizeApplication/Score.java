package com.quizeApplication;

import javax.swing.*;
import java.awt.*;

public class Score extends JFrame {
    JLabel l1, l2, l3, scoreLabel;
    ImageIcon i1;

    Score(String username, int score) {
        InitiliseScreen();
        UserName(username);
        DisplayScore(score);
    }

    public void InitiliseScreen() {
        setBounds(350, 20, 800, 700);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);
        setTitle("Quizes");
    }

    public void UserName(String username) {
        l2 = new JLabel("Thank you  " + username + "  to Attempt This Quize Session");
        l2.setFont((new Font("Viner Hand ITC", Font.BOLD, 22)));
        l2.setForeground(Color.GREEN);
        l2.setBounds(100, 300, 700, 40);
        add(l2);
    }

    public void DisplayScore(int score) {
        l3 = new JLabel(" Your Score is : " + score);
        l3.setFont((new Font("Viner Hand ITC", Font.BOLD, 22)));
        l3.setForeground(Color.GREEN);
        l3.setBounds(100, 350, 600, 40);
        add(l3);
    }

    public static void main(String[] args) {
        System.out.println("lets check score");
        new Score("", 0).setVisible(true);
    }
}
