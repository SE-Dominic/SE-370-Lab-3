import java.awt.*;
import java.awt.color.ColorSpace;
import java.io.*;
import javax.swing.*;
import javax.swing.plaf.synth.ColorType;

public class Main {
        public static void main(String[] args) {
            JFrame window = new JFrame(); //sets the window
            window.setBounds(500, 500, 500, 500);
            window.setVisible(true);
            JPanel panel1 = new JPanel();
            panel1.setBounds(50, 500, 50, 300);

            window.add(panel1);
            window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
}
/*
Dominic's Branch
*/
