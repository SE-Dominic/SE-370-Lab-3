import jdk.jfr.Unsigned;

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

        Draw drawPanel = new Draw(500, 500, 500, 500);
        drawPanel.setBackground(Color.RED);
        windowFrame.add(drawPanel);
        windowFrame.setVisible(true);
    }
}
/*
Dominic's Branch
*/
