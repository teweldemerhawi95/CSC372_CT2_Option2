import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import java.util.Scanner;

public class AgeDisplay implements ActionListener {

    JButton button;
    JLabel label;
    Scanner input = new Scanner(System.in);

    public AgeDisplay() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        label = new JLabel();

        button = new JButton();
        button.setSize(50, 25);
        button.addActionListener(this);

        panel.setBounds(100, 100, 250, 250);
        panel.setBackground(Color.green);
        panel.add(button);
        panel.add(label);

        frame.setTitle("My Frame");
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {

            System.out.println("Enter your birth year: ");
            int birthYear = input.nextInt();

            int age = 2024 - birthYear;

            label.setText("Your age is " + age);
        }
    }
}
