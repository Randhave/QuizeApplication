package com.quizeApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quize extends JFrame implements ActionListener {

    ImageIcon i1;
    JLabel l1, qno, question;
    JButton submit, next;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    String q[][] = new String[10][5];
    String qa[][] = new String[10][2];
    String pa[][] = new String[10][1];
    public static int count = 0;   // static variable depend upon class Not object , if class changed then value of static variable are also change
    public static int timer = 15;
    public static int score = 0;
    public static int given_answer = 0;
    String username;

    Quize(String username) {
        this.username = username;
        InitiliseScreen();
        SetImage();
        Questions();
        Start(count);
    }

    public void InitiliseScreen() {
        setBounds(350, 20, 700, 700);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);
        setTitle("Quizes");
    }

    public void SetImage() {
        i1 = new ImageIcon(ClassLoader.getSystemResource("com/quizeApplication/images/quize.png"));
        l1 = new JLabel(i1);
        l1.setBounds(0, 0, 700, 400);
        add(l1);
    }

    public void Questions() {

        q[0][0] = "Which is used to find and fixed in the Java programs";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "Which of the following is not a Java features ?";
        q[1][1] = "Dynamic";
        q[1][2] = "Architecture Neutral";
        q[1][3] = "Use of Pointers";
        q[1][4] = "Object-Oriented";

        q[2][0] = "Choose the correct statement about java Interface ?";
        q[2][1] = "Interface contains only abstract methods by default";
        q[2][2] = "A java class a implement multiple interface";
        q[2][3] = "An interface can extend or inherit another interface";
        q[2][4] = "All the above";

        q[3][0] = "A java class inherits Constants and Methods of an interface using _____ Keyword";
        q[3][1] = "interface";
        q[3][2] = "implements";
        q[3][3] = "extends";
        q[3][4] = "All the above";

        q[4][0] = "Which of these access specifiers can be used for an interface ?";
        q[4][1] = "Public";
        q[4][2] = "Private";
        q[4][3] = "Protected";
        q[4][4] = "All the above";

        q[5][0] = "Which of these keywords is used to define interface in java";
        q[5][1] = "interface";
        q[5][2] = "Interface";
        q[5][3] = "Interfaces";
        q[5][4] = "interfaces";

        q[6][0] = "Which of these can be used to fully abstract a class from its implementations?";
        q[6][1] = "Objects";
        q[6][2] = "Packages";
        q[6][3] = "Interfaces";
        q[6][4] = "None of the Mentioned";

        q[7][0] = "Which of the following keyword used to create a class?";
        q[7][1] = "class";
        q[7][2] = "classes";
        q[7][3] = "Class";
        q[7][4] = "Classes";

        q[8][0] = "Which of the following data type java can't support";
        q[8][1] = "Pointer";
        q[8][2] = "Int";
        q[8][3] = "ArrayList";
        q[8][4] = "All the above";

        q[9][0] = "is java is Easy to Learn";
        q[9][1] = "No";
        q[9][2] = "Yes";
        q[9][3] = "None";
        q[9][4] = "No but required lot of practice";

        qa[0][1] = "JDB";
        qa[1][1] = "Use of Pointers";
        qa[2][1] = "All the above";
        qa[3][1] = "All the above";
        qa[4][1] = "Public";
        qa[5][1] = "interface";
        qa[6][1] = "Packages";
        qa[7][1] = "class";
        qa[8][1] = "Pointer";
        qa[9][1] = "No but required lot of practice";

        qno = new JLabel();
        qno.setForeground(Color.WHITE);
        qno.setBounds(20, 450, 600, 20);
        add(qno);

        question = new JLabel();
        question.setForeground(Color.WHITE);
        question.setBounds(40, 450, 600, 20);
        add(question);

        Options();
        Next();
        Submit();

    }

    public void Options() {
        opt1 = new JRadioButton();
        opt1.setBounds(30, 500, 400, 20);
        opt1.setBackground(Color.DARK_GRAY);
        opt1.setForeground(Color.WHITE);
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(30, 530, 400, 20);
        opt2.setBackground(Color.DARK_GRAY);
        opt2.setForeground(Color.WHITE);
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(30, 560, 400, 20);
        opt3.setBackground(Color.DARK_GRAY);
        opt3.setForeground(Color.WHITE);
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(30, 590, 400, 20);
        opt4.setBackground(Color.DARK_GRAY);
        opt4.setForeground(Color.WHITE);
        add(opt4);

        // binding opt radio button with ButtonGroup because user select only one out of 4 opt buttons
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        options.clearSelection();
    }

    public void Next() {
        next = new JButton("Next");
        next.setBounds(500, 530, 100, 25);
        next.setBackground(Color.DARK_GRAY);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
    }

    public void Submit() {
        submit = new JButton("Submit");
        submit.setBounds(500, 590, 100, 25);
        submit.setBackground(Color.DARK_GRAY);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);

        submit.setEnabled(false);
        add(submit);
    }

    public void Start(int count) {

        qno.setText("" + (count + 1) + ".");
        question.setText("" + q[count][0]);

        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);

        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);

        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);

        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);

    }

    public void CheckQuestionIsSelected() {
        if (options.getSelection() == null) {
            pa[count][0] = "";
        } else {
            pa[count][0] = options.getSelection().getActionCommand();
        }
    }

    public void CalculateScore() {

        for (int i = 0; i < pa.length; i++) {
            if (pa[i][0].equals(qa[i][1])) {
                score += 10;
                System.out.println("score of one question is " + score);
            } else {
                score += 0;
            }
        }
        System.out.println("total score is +" + score);

    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time Left : " + timer;
        g.setColor(Color.WHITE);
        g.setFont(new Font("Tahoma", Font.BOLD, 15));

        if (timer > 0) {
            g.drawString(time, 505, 450);
        } else {
            g.drawString("Times Up !", 505, 450);
        }

        timer--;
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception error) {
            error.printStackTrace();
        }

        if (timer < 0) {
            timer = 15;

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) {
                CheckQuestionIsSelected();
                CalculateScore();
                this.setVisible(false);
                new Score(username, score).setVisible(true);
            } else {
                CheckQuestionIsSelected();
                options.clearSelection();
                count++;
                Start(count);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == next) {
            repaint();
            timer = 15;
            CheckQuestionIsSelected();
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            options.clearSelection();
            count++;
            Start(count);

        } else if (event.getSource() == submit) {
            CheckQuestionIsSelected();
            CalculateScore();
            this.setVisible(false);
            new Score(username, score).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Quize("").setVisible(true);
        System.out.println("Hello Quize class...");
    }
}
// what is repaint function : The repaint method is an asynchronous method of applet class .
//                            When user call tho repaint method is made , it performs a request to erase and perform redraw of the component after a small delay in time
//                            The repaint method call paint() method internally